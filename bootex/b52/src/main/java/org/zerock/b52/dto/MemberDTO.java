package org.zerock.b52.dto;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

public class MemberDTO extends User{

    public MemberDTO(String username, String password, Collection<? extends GrantedAuthority> authorities) {
        
        super(username, password, authorities);

    }
    
}
