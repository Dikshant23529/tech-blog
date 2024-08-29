package blog.tech.entities;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "like_post")
public class Like {

    @Id
    private String likeId;

    private boolean likePost;

    @ManyToOne
    private User user;

    @ManyToOne
    private Blog blog;

    private LocalDateTime likeDateTime;

    private LocalDateTime updateLikeDateTime;

    private String logMessage;

    public Like() {
    }

    

    public Like(String likeId, boolean likePost, User user, Blog blog, LocalDateTime likeDateTime,
            LocalDateTime updateLikeDateTime, String logMessage) {
        this.likeId = likeId;
        this.likePost = likePost;
        this.user = user;
        this.blog = blog;
        this.likeDateTime = likeDateTime;
        this.updateLikeDateTime = updateLikeDateTime;
        this.logMessage = logMessage;
    }



    public String getLikeId() {
        return likeId;
    }

    public void setLikeId(String likeId) {
        this.likeId = likeId;
    }

   

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Blog getBlog() {
        return blog;
    }

    public void setBlog(Blog blog) {
        this.blog = blog;
    }

    public LocalDateTime getLikeDateTime() {
        return likeDateTime;
    }

    public void setLikeDateTime(LocalDateTime likeDateTime) {
        this.likeDateTime = likeDateTime;
    }

    public LocalDateTime getUpdateLikeDateTime() {
        return updateLikeDateTime;
    }

    public void setUpdateLikeDateTime(LocalDateTime updateLikeDateTime) {
        this.updateLikeDateTime = updateLikeDateTime;
    }

    public String getLogMessage() {
        return logMessage;
    }

    public void setLogMessage(String logMessage) {
        this.logMessage = logMessage;
    }



    public boolean isLikePost() {
        return likePost;
    }



    public void setLikePost(boolean likePost) {
        this.likePost = likePost;
    }

}
