package pe.edu.cibertec.MealDBProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class MealDbProjectApplication {
	public static void main(String[] args) {
		SpringApplication.run(MealDbProjectApplication.class, args);
	}
}