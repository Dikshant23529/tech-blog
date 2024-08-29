package blog.tech.services;

import org.springframework.security.core.Authentication;

import blog.tech.entities.Catagory;

public interface CatagoryService {

    Catagory createCatagory(Authentication authentication,Catagory catagory);

}
