package com.api.serpro.auditoria;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class AuditoriaApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuditoriaApplication.class, args);
	}

}
