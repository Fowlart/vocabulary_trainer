package MVC_package;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Launcher {

    private static final Logger logger = LoggerFactory.getLogger(Launcher.class);

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(Launcher.class);
        // Start the Spring Boot application.
        app.run(args);
        logger.info("Launcher was started.");
    }
}