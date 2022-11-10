package com.grupo7.vinoteca.security.dto;

import lombok.*;
import org.springframework.security.core.GrantedAuthority;

import java.util.Collection;


@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class JwtDto {

    private String token;
    private String bearer = "Bearer";
    private String username;
    private Collection<? extends GrantedAuthority> authorities;
}
