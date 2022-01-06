package com.cgdevlab.spring5jokesappv2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Spring5JokesAppV2Application {

	public static void main(String[] args) {

		SpringApplication.run(Spring5JokesAppV2Application.class, args);

		// Testing logic
		//ApplicationContext ctx = SpringApplication.run(Spring5JokesAppV2Application.class, args);
		//JokesController jokesController = (JokesController) ctx.getBean("jokesController");
		//System.out.println(jokesController.getJoke());
	}

}
