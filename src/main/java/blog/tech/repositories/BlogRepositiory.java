package blog.tech.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import blog.tech.entities.Blog;

public interface BlogRepositiory extends JpaRepository<Blog, String> {

}
