package blog.tech.entities;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class LoggedInDetails {

    @Id
    private String loggedInDetailsId;

    @ManyToOne
    private User user;

    private LocalDateTime loggedInDateTime;

    private String loggedInMessage;

    public LoggedInDetails() {
    }

    public String getLoggedInDetailsId() {
        return loggedInDetailsId;
    }

    public void setLoggedInDetailsId(String loggedInDetailsId) {
        this.loggedInDetailsId = loggedInDetailsId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public LocalDateTime getLoggedInDateTime() {
        return loggedInDateTime;
    }

    public void setLoggedInDateTime(LocalDateTime loggedInDateTime) {
        this.loggedInDateTime = loggedInDateTime;
    }

    public String getLoggedInMessage() {
        return loggedInMessage;
    }

    public void setLoggedInMessage(String loggedInMessage) {
        this.loggedInMessage = loggedInMessage;
    }

}
