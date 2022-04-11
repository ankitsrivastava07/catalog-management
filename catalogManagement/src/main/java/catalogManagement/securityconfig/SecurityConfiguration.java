/*
package catalogManagement.securityconfig;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

    @Override
    public void configure(HttpSecurity httpSecurity) throws Exception {
        httpSecurity.csrf().disable().cors().disable()
                .authorizeRequests()
                .antMatchers("/api/v1/book/*")
                .permitAll()
                .anyRequest()
                .authenticated()
                .and()
                .cors()
                .disable()
                .csrf()
                .disable();
    }
}
*/
