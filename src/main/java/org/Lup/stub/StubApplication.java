package org.Lup.stub;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@SpringBootApplication
@RestController
public class StubApplication {

	public static void main(String[] args) {
		SpringApplication.run(StubApplication.class, args);
	}

	@PostMapping("stub/api/v1/persons")
	public PostPersonResult postPerson(@RequestBody Person person){
		return PostPersonResult.builder()
				.person(person)
				.dateTime(LocalDateTime.now())
				.result("accepted")
				.build();
	}

}
