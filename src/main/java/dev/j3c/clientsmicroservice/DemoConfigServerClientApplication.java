package dev.j3c.configserverclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties
public class DemoConfigServerClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoConfigServerClientApplication.class, args);
    }

}
