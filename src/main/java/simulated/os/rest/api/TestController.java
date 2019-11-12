package main.java.simulated.os.rest.api;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

@RestController
public class TestController {
	@CrossOrigin()
	@GetMapping("/test/{num}")
	public ResponseEntity<String> testget(@PathVariable int num){
		if (num<0) {
            return new ResponseEntity<>(num+" is less than 0",HttpStatus.NOT_FOUND);
            } 
		else {
		return new ResponseEntity<>(num+" is positive",HttpStatus.OK);
			}
	}
}
