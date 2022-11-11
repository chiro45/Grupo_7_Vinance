package com.grupo7.vinoteca.entities;

import com.grupo7.vinoteca.security.entity.Rol;
import com.grupo7.vinoteca.security.enums.Roles;
import lombok.*;
import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "users")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User  extends Base{

    @NotNull
    private String name;

    @NotNull
    @Column(unique = true)
    private String username;

    @NotNull
    private String email;

    @NotNull
    protected String password;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Ticket> ticket;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "user_rol", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "rol_id"))
    private Set<Rol> rol = new HashSet<>();

}