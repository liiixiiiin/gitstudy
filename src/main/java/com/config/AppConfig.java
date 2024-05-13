package com.config;

import com.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan(basePackages = "com")
@Configuration
public class AppConfig {

    @Bean
    public User user(){
        return new User();
    }

}
