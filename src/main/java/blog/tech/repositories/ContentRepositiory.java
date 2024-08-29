package blog.tech.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import blog.tech.entities.Content;

public interface ContentRepositiory extends JpaRepository<Content, String> {

}
