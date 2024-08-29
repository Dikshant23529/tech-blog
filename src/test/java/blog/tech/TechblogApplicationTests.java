package blog.tech;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.core.Authentication;

import blog.tech.entities.User;
import blog.tech.repositories.BlogRepositiory;
import blog.tech.services.impl.UserServiceImpl;

@SpringBootTest
class TechblogApplicationTests {

	@Test
	void contextLoads() {
	}

	@Autowired
	private UserServiceImpl userServiceImpl;

	@Test
	void createUser() {
		User user = new User();
		user.setName("test");
		user.setLastname("test");
		user.setAbout("about");
		user.setEmail("test@gmail.com");
		user.setPassword("123456");
		user.setPhoneno("7999000024");
		userServiceImpl.createUser(user);
	}


}
