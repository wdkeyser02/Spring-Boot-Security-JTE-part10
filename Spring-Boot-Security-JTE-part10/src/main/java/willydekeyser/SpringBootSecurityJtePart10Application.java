package willydekeyser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;

@SpringBootApplication
@EnableMethodSecurity
public class SpringBootSecurityJtePart10Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSecurityJtePart10Application.class, args);
	}

}
