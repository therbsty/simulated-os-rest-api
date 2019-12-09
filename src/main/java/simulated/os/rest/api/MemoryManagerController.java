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
public class MemoryManagerController {
	
	private static BlockTable blockTable = DataBase.getBlockTable();
	private static MemoryTable memoryTable = DataBase.getMemoryTable();
	private static JobTable jobTable = DataBase.getJobTable();
	
	@CrossOrigin()
	@PostMapping("/memorymanager/newjob")
	public ResponseEntity<Object> addNewJob(){
		if (false) {
            return new ResponseEntity<>("bad",HttpStatus.NOT_FOUND);
            } 
		else {
			return new ResponseEntity<>("good",HttpStatus.OK);
		}
	}
	
	@CrossOrigin()
	@GetMapping("/memorymanager/getmemorytable")
	public ResponseEntity<Object> getMemoryTable(){
		if (false) {
            return new ResponseEntity<>("bad",HttpStatus.NOT_FOUND);
            } 
		else {
			return new ResponseEntity<>("good",HttpStatus.OK);
		}
	}
}