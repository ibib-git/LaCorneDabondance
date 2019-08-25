package com.spring.henallux.laCorneDabondance.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.security.crypto.password.Pbkdf2PasswordEncoder;
import org.springframework.validation.DefaultMessageCodesResolver;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class MainConfiguration extends WebMvcConfigurerAdapter {


    @Bean
    public Pbkdf2PasswordEncoder passwordEncoder() {
        return new Pbkdf2PasswordEncoder() ;
    }

    @Bean
    public DefaultMessageCodesResolver defaultMessageCodesResolver() {
        DefaultMessageCodesResolver defaultMessageCodesResolver = new DefaultMessageCodesResolver();
        return defaultMessageCodesResolver;
    }

    @Bean
    public ResourceBundleMessageSource messageSource() {
        ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
        messageSource.setDefaultEncoding("UTF-8");
        messageSource.setBasenames("translation/general","translation/errors");
        messageSource.setUseCodeAsDefaultMessage(true);
        return messageSource;
    }




}