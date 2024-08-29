package blog.tech.security.userservice;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import blog.tech.entities.User;

public class UserDetailsImpl implements UserDetails {

    private User user;

    public UserDetailsImpl(User user) {
        this.user = user;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        SimpleGrantedAuthority simpleGrantedAuthority = new SimpleGrantedAuthority(user.getRole());
        List<SimpleGrantedAuthority> authorityList = Collections.singletonList(simpleGrantedAuthority);
        return authorityList;
    }

    @Override
    public String getPassword() {
      return user.getPassword();
    }

    @Override
    public String getUsername() {
        return user.getEmail();
    }

}
