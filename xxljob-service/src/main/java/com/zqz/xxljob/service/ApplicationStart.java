package com.zqz.xxljob.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Author: ZQZ
 * @Description:
 * @ClassName: ApplicationStart
 * @Date: Created in 14:58 2022-7-4
 */
@SpringBootApplication
@ComponentScan(basePackages = {"com.zqz"})
public class ApplicationStart {


    public static void main(String[] args) {
        SpringApplication.run(ApplicationStart.class, args);
    }
}
