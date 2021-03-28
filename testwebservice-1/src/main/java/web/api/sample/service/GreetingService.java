package web.api.sample.service;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {
	
	public String viewGreeting(double d) {		
		return " The total sum x 20.42 = " + d; 
		
						
	}
}

