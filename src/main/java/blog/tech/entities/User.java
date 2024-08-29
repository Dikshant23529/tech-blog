package blog.tech.entities;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class User {

    @Id
    private String userid;

    private String name;

    private String lastname;

    @Column(nullable = false)
    private String email;

    private String password;

    private String about;

    private String role;

    private LocalDateTime createdDate;

    private LocalDateTime updateDateTime;

    private boolean emailVerified;

    private String phoneno;

    private boolean isAccountVerified;

    private boolean isPasswordExpired;

    private LoginProvider loginProvider = LoginProvider.Email;

    public User() {
    }

    public User(String userid, String name, String lastname, String email, String password, String about, String role,
            LocalDateTime createdDate, LocalDateTime updateDateTime, boolean emailVerified, String phoneno,
            boolean isAccountVerified, boolean isPasswordExpired, LoginProvider loginProvider) {
        this.userid = userid;
        this.name = name;
        this.lastname = lastname;
        this.email = email;
        this.password = password;
        this.about = about;
        this.role = role;
        this.createdDate = createdDate;
        this.updateDateTime = updateDateTime;
        this.emailVerified = emailVerified;
        this.phoneno = phoneno;
        this.isAccountVerified = isAccountVerified;
        this.isPasswordExpired = isPasswordExpired;
        this.loginProvider = loginProvider;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }

    public LocalDateTime getUpdateDateTime() {
        return updateDateTime;
    }

    public void setUpdateDateTime(LocalDateTime updateDateTime) {
        this.updateDateTime = updateDateTime;
    }

    public boolean isEmailVerified() {
        return emailVerified;
    }

    public void setEmailVerified(boolean emailVerified) {
        this.emailVerified = emailVerified;
    }

    public String getPhoneno() {
        return phoneno;
    }

    public void setPhoneno(String phoneno) {
        this.phoneno = phoneno;
    }

    public boolean isAccountVerified() {
        return isAccountVerified;
    }

    public void setAccountVerified(boolean isAccountVerified) {
        this.isAccountVerified = isAccountVerified;
    }

    public boolean isPasswordExpired() {
        return isPasswordExpired;
    }

    public void setPasswordExpired(boolean isPasswordExpired) {
        this.isPasswordExpired = isPasswordExpired;
    }

    public LoginProvider getLoginProvider() {
        return loginProvider;
    }

    public void setLoginProvider(LoginProvider loginProvider) {
        this.loginProvider = loginProvider;
    }

}
