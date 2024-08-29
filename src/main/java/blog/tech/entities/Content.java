package blog.tech.entities;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Content {

    @Id
    private String contentId;

    private String content;

    private String imgUrl;

    private String videoUrl;

    @ManyToOne
    @JsonIgnore
    private Blog blog;

    private LocalDateTime contentCreateDate;

    private LocalDateTime contentUpdateDate;

    public Content() {
    }

    public Content(String contentId, String content, String imgUrl, String videoUrl, Blog blog,
            LocalDateTime contentCreateDate, LocalDateTime contentUpdateDate) {
        this.contentId = contentId;
        this.content = content;
        this.imgUrl = imgUrl;
        this.videoUrl = videoUrl;
        this.blog = blog;
        this.contentCreateDate = contentCreateDate;
        this.contentUpdateDate = contentUpdateDate;
    }

    public String getContentId() {
        return contentId;
    }

    public void setContentId(String contentId) {
        this.contentId = contentId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public Blog getBlog() {
        return blog;
    }

    public void setBlog(Blog blog) {
        this.blog = blog;
    }

    public LocalDateTime getContentCreateDate() {
        return contentCreateDate;
    }

    public void setContentCreateDate(LocalDateTime contentCreateDate) {
        this.contentCreateDate = contentCreateDate;
    }

    public LocalDateTime getContentUpdateDate() {
        return contentUpdateDate;
    }

    public void setContentUpdateDate(LocalDateTime contentUpdateDate) {
        this.contentUpdateDate = contentUpdateDate;
    }

}
