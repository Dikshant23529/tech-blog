package blog.tech.entities;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Blog {

    @Id
    private String blogId;

    private String title;

    private String description;

    @OneToMany(mappedBy = "blog", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Content> content = new ArrayList<>();

    private LocalDateTime blogCreateDateTime;

    private LocalDateTime blogUpdateDateTime;

    @ManyToOne
    private Catagory catagory;

    @ManyToOne
    private User user;

    public Blog() {
    }

    public Blog(String blogId, String title, String description, List<Content> content,
            LocalDateTime blogCreateDateTime, LocalDateTime blogUpdateDateTime, Catagory catagory, User user) {
        this.blogId = blogId;
        this.title = title;
        this.description = description;
        this.content = content;
        this.blogCreateDateTime = blogCreateDateTime;
        this.blogUpdateDateTime = blogUpdateDateTime;
        this.catagory = catagory;
        this.user = user;
    }

    public String getBlogId() {
        return blogId;
    }

    public void setBlogId(String blogId) {
        this.blogId = blogId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Content> getContent() {
        return content;
    }

    public void setContent(List<Content> content) {
        this.content = content;
    }

    public LocalDateTime getBlogCreateDateTime() {
        return blogCreateDateTime;
    }

    public void setBlogCreateDateTime(LocalDateTime blogCreateDateTime) {
        this.blogCreateDateTime = blogCreateDateTime;
    }

    public LocalDateTime getBlogUpdateDateTime() {
        return blogUpdateDateTime;
    }

    public void setBlogUpdateDateTime(LocalDateTime blogUpdateDateTime) {
        this.blogUpdateDateTime = blogUpdateDateTime;
    }

    public Catagory getCatagory() {
        return catagory;
    }

    public void setCatagory(Catagory catagory) {
        this.catagory = catagory;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

}
