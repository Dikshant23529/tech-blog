package blog.tech.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import blog.tech.entities.Catagory;

public interface CatagoryRepositiory extends JpaRepository<Catagory, String> {

}
