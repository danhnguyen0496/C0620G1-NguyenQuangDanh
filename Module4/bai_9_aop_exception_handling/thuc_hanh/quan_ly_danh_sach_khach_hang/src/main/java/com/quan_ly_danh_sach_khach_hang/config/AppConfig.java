package com.quan_ly_danh_sach_khach_hang.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration


public class AppConfig {
    @Bean
    public LogCustomer createLogCustomer() {
        return new LogCustomer();
    }
}
