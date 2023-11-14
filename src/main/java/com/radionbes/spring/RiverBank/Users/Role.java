package com.radionbes.spring.RiverBank.Users;

import org.springframework.security.core.GrantedAuthority;


public enum Role implements GrantedAuthority  {
    ADMIN,
    JOB,
    USER;

    @Override
    public String getAuthority() {
        return name();
    }
}
