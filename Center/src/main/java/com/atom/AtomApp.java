package com.atom;


import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@NacosPropertySource(dataId = "Center",autoRefreshed = true)
public class AtomApp {

    public static void main(String[] args) {
        SpringApplication.run(AtomApp.class, args);
    }

}
