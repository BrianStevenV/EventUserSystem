package com.event.users.adapter.driven.adapters;

import com.event.users.adapter.driven.PrincipalUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
@Service
public class UserDetailsServiceImp implements UserDetailsService {
    @Autowired
    IUserRepository userRepository;
    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {

        if(user.getIdRole() == null ){
            throw new UsernameNotFoundException("User not found with account: " + email);
        }

        List<RoleEntity> roles = new ArrayList<>();
        roles.add(user.getIdRole());

        return PrincipalUser.build(user, roles);
    }
}
