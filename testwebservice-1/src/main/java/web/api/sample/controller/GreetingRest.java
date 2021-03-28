package web.api.sample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import web.api.sample.service.GreetingService;

@RestController
@RequestMapping("/api")

public class GreetingRest {

	@Autowired
	GreetingService service;
	
	@Value("${custom.config.key}")
	float key;
	
	//To test http://localhost:8080/api/greet?x=2&y=4&z=6&w=8
	@GetMapping("/greet")
	public String greetByPassingParam(@RequestParam int x, @RequestParam int y, @RequestParam int z, @RequestParam int w) {		
		return service.viewGreeting((x + y + z + w)*key);
	}
}
