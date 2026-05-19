package pl.edu.vistula.task1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"pl.edu.vistula.task1", "controller"})
public class Task1Application {

	public static void main(String[] args) {
		SpringApplication.run(Task1Application.class, args);
	}
}
