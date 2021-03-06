package com.hm.hospitalproject;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2

@MapperScan("com.hm.hospitalproject.mapper")
@SpringBootApplication
public class HospitalprojectApplication {

    public static void main(String[] args) {
        SpringApplication.run(HospitalprojectApplication.class, args);
    }

}
