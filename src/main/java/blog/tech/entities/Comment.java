package blog.tech.entities;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Comment {

    @Id
    private String commentId;

    private String comment;

    @ManyToOne
    private User user;

    @ManyToOne
    private Blog blog;

    private LocalDateTime commentDateTime;

    private boolean deleteComment = true;

    private LocalDateTime updateCommentDateTime;

    private String logMessage;

    public Comment() {
    }

    public Comment(String commentId, String comment, User user, Blog blog, LocalDateTime commentDateTime,
            boolean deleteComment, LocalDateTime updateCommentDateTime, String logMessage) {
        this.commentId = commentId;
        this.comment = comment;
        this.user = user;
        this.blog = blog;
        this.commentDateTime = commentDateTime;
        this.deleteComment = deleteComment;
        this.updateCommentDateTime = updateCommentDateTime;
        this.logMessage = logMessage;
    }

    public String getCommentId() {
        return commentId;
    }

    public void setCommentId(String commentId) {
        this.commentId = commentId;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
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

    public LocalDateTime getCommentDateTime() {
        return commentDateTime;
    }

    public void setCommentDateTime(LocalDateTime commentDateTime) {
        this.commentDateTime = commentDateTime;
    }

    public boolean isDeleteComment() {
        return deleteComment;
    }

    public void setDeleteComment(boolean deleteComment) {
        this.deleteComment = deleteComment;
    }

    public LocalDateTime getUpdateCommentDateTime() {
        return updateCommentDateTime;
    }

    public void setUpdateCommentDateTime(LocalDateTime updateCommentDateTime) {
        this.updateCommentDateTime = updateCommentDateTime;
    }

    public String getLogMessage() {
        return logMessage;
    }

    public void setLogMessage(String logMessage) {
        this.logMessage = logMessage;
    }

}
