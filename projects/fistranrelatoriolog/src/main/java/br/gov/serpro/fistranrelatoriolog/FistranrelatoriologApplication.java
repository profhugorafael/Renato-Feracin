package br.gov.serpro.fistranrelatoriolog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableFeignClients
public class FistranrelatoriologApplication {

	public static void main(String[] args) {

		SpringApplication.run(FistranrelatoriologApplication.class, args);
	}

	@GetMapping("/")
	public String index() {return "Olá Mundo!";}

}
