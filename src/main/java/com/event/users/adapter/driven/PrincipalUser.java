package com.event.users.adapter.driven;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class PrincipalUser implements UserDetails {
    private Long id;
    private String name;
    private String email;
    private String password;
    private Collection<? extends GrantedAuthority> authorities;

    public PrincipalUser(Long id, String name, String email, String password, Collection<? extends GrantedAuthority> authorities) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.authorities = authorities;
    }
    public static PrincipalUser build(UserEntityVerification userEntity, List<RoleEntity> roles){
        List<GrantedAuthority> authorities = roles.stream()
                .map(rol -> new SimpleGrantedAuthority()).collect(Collectors.toList());
        return new PrincipalUser(userEntity.getEmail(), userEntity.getPassword(), authorities);
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return email;
    }

    @Override
    public boolean isAccountNonExpired() {
        return false;
    }

    @Override
    public boolean isAccountNonLocked() {
        return false;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return false;
    }

    @Override
    public boolean isEnabled() {
        return false;
    }
}
