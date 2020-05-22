package com.puralsight.conferencedemo.config;

import javax.sql.DataSource;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PersistenceConfiguration {
   /* @Bean
    public DataSource dataSource() {
        DataSourceBuilder builder = DataSourceBuilder.create();
        builder.url("jdbc:postgresql://localhost:5432/postgres");
        builder.username("postgres");
        builder.password("Welcome");
        System.out.println("My Custom datasource bean has been initialized and set");
        return builder.build();
    } */
}
