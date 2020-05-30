package co.edu.ucentral.app.automovil;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;


@EnableEurekaClient
@SpringBootApplication
public class ServicioAutomovilApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServicioAutomovilApplication.class, args);
	}

}
