package com.training.pms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class RakutenDevopsJenkinsApplication {

	public static void main(String[] args) {
		SpringApplication.run(RakutenDevopsJenkinsApplication.class, args);
	}
	
	@GetMapping("india")
	public String getMessage() {
		return "Rakuten India welcomes you to india!!!!";
	}
	
	@GetMapping("japan")
	public String getMessage1() {
		return "Rakuten japan welcomes you to japan!!!!";
	}
}
