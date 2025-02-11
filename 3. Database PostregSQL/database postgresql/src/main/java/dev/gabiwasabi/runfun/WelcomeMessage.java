package dev.gabiwasabi.runfun;

import org.springframework.stereotype.Component;

@Component //means that this class is available to Spring
public class WelcomeMessage {
    public String getWelcomeMessage() {
        return "Welcome to the Spring Boot Application!";
    }
}
