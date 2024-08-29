package blog.tech.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import blog.tech.entities.Blog;
import blog.tech.repositories.BlogRepositiory;
import blog.tech.services.impl.BlogServicesImpl;

@RestController
@RequestMapping("/api/v0/blog")
public class BlogControllers {

    @Autowired
    private BlogServicesImpl blogServicesImpl;

    @Autowired
    private BlogRepositiory blogRepositiory;

    @PostMapping("/create")
    public ResponseEntity<Blog> createBlog(Authentication authentication, Blog blog) {
        return ResponseEntity.ok(blogServicesImpl.createBlog(authentication, blog));
    }

    @GetMapping
    public Blog getBlog(@RequestParam String id) {
        return blogRepositiory.findById(id).orElseThrow(() -> new IllegalArgumentException("incorrect ID"));
    }

}
