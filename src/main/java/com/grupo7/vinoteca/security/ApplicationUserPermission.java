package com.grupo7.vinoteca.security;

import lombok.Getter;

@Getter
public enum ApplicationUserPermission {
    USER_READ("user:read"),
    USER_WRITE("user:write"),
    SELLER_READ("seller:read"),
    SELLER_WRITE("seller:write");


    private final String permission;

    ApplicationUserPermission(String permission) {
        this.permission = permission;
    }


}
