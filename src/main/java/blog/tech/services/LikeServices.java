package blog.tech.services;

import org.springframework.security.core.Authentication;

import blog.tech.entities.Like;

public interface LikeServices {

    Like likePost(Authentication authentication, Like like);

}
