package dev.j3c.configserverclient.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/clients-microservice")
public class ConfigController {

    private final ApplicationConfig applicationConfig;

    @Autowired
    public ConfigController(ApplicationConfig applicationConfig) {
        this.applicationConfig = applicationConfig;
    }

    @GetMapping("/text-property")
    public ResponseEntity<String> getTextProperty() {
        return ResponseEntity.ok(this.applicationConfig.getTextProperty());
    }

    @GetMapping("/number-property")
    public ResponseEntity<Integer> getNumberProperty() {
        return ResponseEntity.ok(this.applicationConfig.getNumberProperty());
    }

    @GetMapping("/stage-name")
    public ResponseEntity<String> getStageName() {
        return ResponseEntity.ok(this.applicationConfig.getStageName());
    }

}
