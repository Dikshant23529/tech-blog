package blog.tech.services.impl;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

import blog.tech.entities.Blog;
import blog.tech.entities.User;
import blog.tech.repositories.BlogRepositiory;
import blog.tech.repositories.UserRepositiory;
import blog.tech.services.BlogServices;

@Service
public class BlogServicesImpl implements BlogServices {

    @Autowired
    private BlogRepositiory blogRepositiory;

    @Autowired
    private UserRepositiory userRepositiory;

    @Override
    public Blog createBlog(Authentication authentication ,Blog blog) {
        if (authentication.isAuthenticated()) {
            String username = authentication.getName();
            User user =  userRepositiory.findByEmail(username).orElseThrow(() -> new IllegalAccessError("User Not present"));
            blog.setBlogId(UUID.randomUUID().toString());
            blog.setUser(user);
            return blogRepositiory.save(blog);
        } else {
            throw new IllegalAccessError("You do not have the access to create blog Post");
        }
    }

}
