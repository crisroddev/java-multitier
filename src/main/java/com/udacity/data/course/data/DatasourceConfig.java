package com.udacity.data.course.data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class DatasourceConfig {
    @Bean
    @Primary
    @ConfigurationProperties(prefix = "com.udacity.datasource")
    public DatasourceConfig getDatasource(){
        DataSourceBuilder dsb = DataSourceBuilder.create();
        dsb.username("admin");
        dsb.password(securePasswordService());
        dsb.url("jdbc:mysql://localhost:3306/plant");
        return (DatasourceConfig) dsb.build();
    }

    private String securePasswordService(){
        return "admin1234";
    }
}
