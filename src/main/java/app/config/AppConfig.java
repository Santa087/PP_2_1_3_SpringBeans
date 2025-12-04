package app.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.security.DigestException;

@Configuration
@ComponentScan(basePackages = "app")
@Component
@Qualifier("dog")


public class AppConfig {

}
