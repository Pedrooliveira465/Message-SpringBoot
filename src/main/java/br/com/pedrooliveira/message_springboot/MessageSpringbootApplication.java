package br.com.pedrooliveira.message_springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@SpringBootApplication
public class MessageSpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(MessageSpringbootApplication.class, args);
	}

}

@RestController
@RequestMapping("/kafka")
class HelloController {
	private HelloProducer service;

	public HelloController(HelloProducer service) {
		this.service = service;
	}

	@GetMapping("/hello/{name}")
	public String hello(@PathVariable("name") String name) {
		service.sendMessage("Hello, " + name);
		return "OK";
	}
}