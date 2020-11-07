package com.phan_quyen_ung_dung_blog.config;

import com.phan_quyen_ung_dung_blog.service.impl.UserDetailsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.access.AccessDecisionManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.authentication.rememberme.JdbcTokenRepositoryImpl;
import org.springframework.security.web.authentication.rememberme.PersistentTokenRepository;

import javax.sql.DataSource;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private DataSource dataSource;

    @Autowired
    private UserDetailsServiceImpl userDetailsService;

    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        return bCryptPasswordEncoder;
    }

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        // Sét đặt dịch vụ để tìm kiếm User trong Database.
        // Và sét đặt PasswordEncoder.
        auth.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder());
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        // csrf
        http.csrf().disable();

        // login
        http.formLogin()
                .loginProcessingUrl("/checkLogin")
                .loginPage("/login")
                // login successful
                .defaultSuccessUrl("/home-blog")
                // login failed
                .failureUrl("/login?error=true")
                // setting username, password
                .usernameParameter("username")
                .passwordParameter("password")
                // logout
                .and().logout().logoutUrl("/logout")
                // logout successful
                .logoutSuccessUrl("/login");

        // authorization
//        http.authorizeRequests().antMatchers("/*").denyAll();
        // guest
        http.authorizeRequests().antMatchers("/login", "/logout").permitAll();

        // user
        http.authorizeRequests().antMatchers("/home-blog", "/blog/view/*", "/view/category")
                .hasRole("USER");

        // admin
//        http.authorizeRequests().antMatchers("/create", "/blog/update/{id}", "/blog/update",
//                "/blog/delete/{id}", "/blog/delete", "/create/category", "/delete/category/{id}", "/delete/category",
//                "/update/category/{id}", "/update/category").access("hasAnyRole('ROLE_ADMIN')");

        http.authorizeRequests().antMatchers("/**").access("hasAnyRole('ROLE_ADMIN')");

        // no permission
        http.exceptionHandling().accessDeniedPage("/403");

        // rememberMe
        http.rememberMe()
                .rememberMeParameter("rememberMe")
                .rememberMeCookieName("rememberMeCookie")
                .tokenValiditySeconds(100)
                .tokenRepository(this.persistentTokenRepository());
    }

    // Token stored in Table - persistent_logins
    @Bean
    public PersistentTokenRepository persistentTokenRepository() {
        JdbcTokenRepositoryImpl db = new JdbcTokenRepositoryImpl();
        db.setDataSource(dataSource);
        return db;
    }
}
