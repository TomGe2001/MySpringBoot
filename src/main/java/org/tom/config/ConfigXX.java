package org.tom.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.tom.entity.User;

@Configuration
public class ConfigXX {
    @Bean
    public String str() {
        return "string";
    }

    @Bean("myUser")
    public User user() {
        User user = new User();
        user.setId(1);
        user.setName("张三");
        return user;
    }

    @Bean("tom")
    public User userTom(){
        User user = new User();
        user.setId(1);
        user.setName("tom");
        return user;
    }
}
