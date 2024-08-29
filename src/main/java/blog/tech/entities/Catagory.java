package blog.tech.entities;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Catagory {

    @Id
    private String catagoryId;

    private String name;

    @ManyToOne
    private User user;

    private String description;

    private LocalDateTime catagoryCreateDateTime;

    private LocalDateTime catagoryUpdateDateTime;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "catagory")
    private List<Blog> blogs = new ArrayList<>();

    public Catagory() {
    }

    public Catagory(String catagoryId, String name, User user, String description, LocalDateTime catagoryCreateDateTime,
            LocalDateTime catagoryUpdateDateTime, List<Blog> blogs) {
        this.catagoryId = catagoryId;
        this.name = name;
        this.user = user;
        this.description = description;
        this.catagoryCreateDateTime = catagoryCreateDateTime;
        this.catagoryUpdateDateTime = catagoryUpdateDateTime;
        this.blogs = blogs;
    }

    public String getCatagoryId() {
        return catagoryId;
    }

    public void setCatagoryId(String catagoryId) {
        this.catagoryId = catagoryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getCatagoryCreateDateTime() {
        return catagoryCreateDateTime;
    }

    public void setCatagoryCreateDateTime(LocalDateTime catagoryCreateDateTime) {
        this.catagoryCreateDateTime = catagoryCreateDateTime;
    }

    public LocalDateTime getCatagoryUpdateDateTime() {
        return catagoryUpdateDateTime;
    }

    public void setCatagoryUpdateDateTime(LocalDateTime catagoryUpdateDateTime) {
        this.catagoryUpdateDateTime = catagoryUpdateDateTime;
    }

    public List<Blog> getBlogs() {
        return blogs;
    }

    public void setBlogs(List<Blog> blogs) {
        this.blogs = blogs;
    }

}
