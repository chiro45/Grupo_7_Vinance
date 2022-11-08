package com.grupo7.vinoteca.security;

import com.grupo7.vinoteca.auth.ApplicationUserService;
import com.grupo7.vinoteca.jwt.JwtConfig;
import com.grupo7.vinoteca.jwt.JwtTokenVerifier;
import com.grupo7.vinoteca.jwt.JwtUsernameAndPasswordAuthenticationFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.password.PasswordEncoder;

import javax.crypto.SecretKey;

import static com.grupo7.vinoteca.security.ApplicationUserRole.SELLER;
import static com.grupo7.vinoteca.security.ApplicationUserRole.USER;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class ApplicationSecurityConfig extends WebSecurityConfigurerAdapter {

    private final PasswordEncoder passwordEncoder;

    private final ApplicationUserService applicationUserService;
    private final SecretKey secretKey;
    private final JwtConfig jwtConfig;

    @Autowired
    public ApplicationSecurityConfig(PasswordEncoder passwordEncoder,
                                     ApplicationUserService applicationUserService,
                                     SecretKey secretKey,
                                     JwtConfig jwtConfig) {
        this.passwordEncoder = passwordEncoder;
        this.applicationUserService = applicationUserService;
        this.secretKey = secretKey;
        this.jwtConfig = jwtConfig;
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .cors()
                .and()
                .csrf().disable()//Como aun no tenemos token, con csrf deshabilitado podemos hacer llamadas a postman
                /*csrfTokenRepository(CookieCsrfTokenRepository.withHttpOnlyFalse())
                .and()*/ //COn esto usamos para react
                .sessionManagement()
                    .sessionCreationPolicy(SessionCreationPolicy.STATELESS)
                .and()
                .addFilter(new JwtUsernameAndPasswordAuthenticationFilter(authenticationManager(), jwtConfig, secretKey))
                .addFilterAfter(new JwtTokenVerifier(secretKey, jwtConfig), JwtUsernameAndPasswordAuthenticationFilter.class)
                .authorizeRequests()
                .antMatchers("/sellers/**").hasRole(SELLER.name())
                .antMatchers("/users/**").hasRole(USER.name())
                /*.antMatchers(HttpMethod.DELETE,"/wines/**").hasAuthority(SELLER_WRITE.getPermission())
                *//*.antMatchers(HttpMethod.POST,"/wines").hasAuthority(SELLER_WRITE.getPermission())*//*
                .antMatchers(HttpMethod.POST,"/wines/**").hasAuthority(SELLER_WRITE.getPermission())
                .antMatchers(HttpMethod.PUT,"/wines/**").hasAuthority(SELLER_WRITE.getPermission())*/
                .antMatchers(HttpMethod.GET,"/wines/**").permitAll()
                .anyRequest()
                .authenticated();



                //.httpBasic();
                /*.and()
                .formLogin()
                .loginPage(("/login")).permitAll()
                .and()
                .rememberMe()//Recuerda el token por 2 semanas por defecto
                    .tokenValiditySeconds((int) TimeUnit.DAYS.toSeconds(21))
                    .key("clavemuysegura")
                .and()
                .logout()
                    .logoutUrl("/logout")
                    .clearAuthentication(true)
                    .invalidateHttpSession(true)
                    .deleteCookies("JSESSIONID", "remember-me")
                    .logoutSuccessUrl("/login");*/
    }



    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.authenticationProvider(daoAuthenticationProvider());
    }

    @Bean
    public DaoAuthenticationProvider daoAuthenticationProvider () {
        DaoAuthenticationProvider provider = new DaoAuthenticationProvider();

        provider.setPasswordEncoder(passwordEncoder);
        provider.setUserDetailsService(applicationUserService);

        return provider;
    }
}
