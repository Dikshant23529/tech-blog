package blog.tech.services.impl;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import blog.tech.entities.Comment;
import blog.tech.entities.Like;
import blog.tech.entities.LoggedInDetails;
import blog.tech.entities.LoginProvider;
import blog.tech.entities.User;
import blog.tech.repositories.UserRepositiory;
import blog.tech.services.UserServices;

@Service
public class UserServiceImpl implements UserServices {

    @Autowired
    private UserRepositiory userRepositiory;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public User createUser(User user) {
        user.setUserid(UUID.randomUUID().toString());
        user.setCreatedDate(LocalDateTime.now());
        user.setUpdateDateTime(LocalDateTime.now());
        user.setPasswordExpired(false);
        user.setEmailVerified(false);
        user.setAccountVerified(false);
        user.setPasswordExpired(false);
        user.setRole("USER");
        user.setLoginProvider(LoginProvider.Email);
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return userRepositiory.save(user);
    }

    @Override
    public User updateUser(Authentication authentication) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateUser'");
    }

    @Override
    public User deleteUser(Authentication authentication) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteUser'");
    }

    @Override
    public User getUserDetails(Authentication authentication) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getUserDetails'");
    }

    @Override
    public List<LoggedInDetails> userLoggedInDetails(Authentication authentication) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'userLoggedInDetails'");
    }

    @Override
    public List<Like> userLikedList(Authentication authentication) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'userLikedList'");
    }

    @Override
    public List<Comment> usersCommentsList(Authentication authentication) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'usersCommentsList'");
    }

}
