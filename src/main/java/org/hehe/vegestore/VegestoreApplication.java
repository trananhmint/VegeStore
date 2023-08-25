package org.hehe.vegestore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class VegestoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(VegestoreApplication.class, args);
	}

}
