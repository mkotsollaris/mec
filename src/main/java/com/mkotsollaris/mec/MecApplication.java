package com.mkotsollaris.mec;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@Configuration
@EnableAutoConfiguration
@ComponentScan
@EnableSwagger2
public class MecApplication {

    public static void main(String[] args) {
        SpringApplication.run(MecApplication.class, args);
    }
}
