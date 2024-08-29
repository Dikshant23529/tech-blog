package blog.tech.services;

import org.springframework.security.core.Authentication;

import blog.tech.entities.Blog;

public interface BlogServices {

    Blog createBlog(Authentication authentication,  Blog blog);

}
