package dev.j3c.clientsmicroservice.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties
@RefreshScope // --> Enables a POST type request for actuator [/actuator/refresh] to refresh properties without restarting the application.
public class ApplicationConfig {

    @Value("${client.text.property}")
    private String textProperty;

    @Value("${client.number.property}")
    private Integer numberProperty;

    @Value("${client.stage.name}")
    private String stageName;

    public String getTextProperty() {
        return this.textProperty;
    }

    public void setTextProperty(String textProperty) {
        this.textProperty = textProperty;
    }

    public Integer getNumberProperty() {
        return this.numberProperty;
    }

    public void setNumberProperty(Integer numberProperty) {
        this.numberProperty = numberProperty;
    }

    public String getStageName() {
        return this.stageName;
    }

    public void setStageName(String stageName) {
        this.stageName = stageName;
    }
}
