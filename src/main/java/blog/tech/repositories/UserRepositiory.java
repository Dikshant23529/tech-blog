package blog.tech.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import blog.tech.entities.User;

public interface UserRepositiory extends JpaRepository<User, String> {

    Optional<User> findByEmail(String email);

}
