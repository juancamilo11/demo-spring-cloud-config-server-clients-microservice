package dev.j3c.clientsmicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplicationgit
@EnableConfigurationProperties
public class DemoConfigServerClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoConfigServerClientApplication.class, args);
    }

}
