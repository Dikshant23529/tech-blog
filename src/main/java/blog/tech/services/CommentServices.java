package blog.tech.services;

import org.springframework.security.core.Authentication;

import blog.tech.entities.Comment;

public interface CommentServices {

    Comment postComment(Authentication authentication,Comment comment);

}
