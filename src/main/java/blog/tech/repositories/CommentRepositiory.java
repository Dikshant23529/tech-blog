package blog.tech.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import blog.tech.entities.Comment;

public interface CommentRepositiory extends JpaRepository<Comment, String> {

}
