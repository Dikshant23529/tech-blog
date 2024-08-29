package blog.tech.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import blog.tech.entities.Like;

public interface LikeRepositiory extends JpaRepository<Like, String> {

}
