package blog.tech.services;

import org.springframework.security.core.Authentication;

import blog.tech.entities.Content;

public interface ContentServices {

    Content createContent(Authentication authentication, Content content);

}
