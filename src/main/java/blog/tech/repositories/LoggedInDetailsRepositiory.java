package blog.tech.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import blog.tech.entities.LoggedInDetails;

public interface LoggedInDetailsRepositiory extends JpaRepository<LoggedInDetails, String> {

}
