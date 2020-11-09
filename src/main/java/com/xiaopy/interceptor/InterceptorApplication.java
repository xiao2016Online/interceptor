package com.xiaopy.interceptor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication(scanBasePackages = "com.xiaopy")
@ServletComponentScan
public class InterceptorApplication {

    public static void main(String[] args) {
        SpringApplication.run(InterceptorApplication.class, args);
    }

}
