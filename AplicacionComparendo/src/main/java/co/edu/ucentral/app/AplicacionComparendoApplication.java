package co.edu.ucentral.app;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@EnableEurekaClient
@SpringBootApplication
public class AplicacionComparendoApplication {

	public static void main(String[] args) {
		SpringApplication.run(AplicacionComparendoApplication.class, args);
	}

}
