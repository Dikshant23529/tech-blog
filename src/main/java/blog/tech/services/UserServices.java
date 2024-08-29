package blog.tech.services;

import java.util.List;

import org.springframework.security.core.Authentication;

import blog.tech.entities.Comment;
import blog.tech.entities.Like;
import blog.tech.entities.LoggedInDetails;
import blog.tech.entities.User;

public interface UserServices {

    User createUser(User user);

    User updateUser(Authentication authentication);

    User deleteUser(Authentication authentication);

    User getUserDetails(Authentication authentication);

    List<LoggedInDetails> userLoggedInDetails(Authentication authentication);

    List<Like> userLikedList (Authentication authentication);

    List<Comment> usersCommentsList(Authentication authentication);

}
