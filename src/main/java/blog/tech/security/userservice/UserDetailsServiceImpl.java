package blog.tech.security.userservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import blog.tech.entities.User;
import blog.tech.repositories.UserRepositiory;

@Component
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UserRepositiory userRepositiory;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepositiory.findByEmail(username)
                .orElseThrow(() -> new IllegalArgumentException("User not found" + username));
        return new UserDetailsImpl(user);
    }

}
