package com.xy.boot.security.entities;

import org.springframework.security.core.GrantedAuthority;

import java.util.Collection;

/**
 * description
 *
 * @author XiaoYi
 * Created on 2022/1/21.
 */
public class User extends org.springframework.security.core.userdetails.User {
    public User(String username, String password, Collection<? extends GrantedAuthority> authorities) {
        super(username, password, authorities);
    }

    public User(String username, String password, boolean enabled, boolean accountNonExpired, boolean credentialsNonExpired, boolean accountNonLocked, Collection<? extends GrantedAuthority> authorities) {
        super(username, password, enabled, accountNonExpired, credentialsNonExpired, accountNonLocked, authorities);
    }


}
