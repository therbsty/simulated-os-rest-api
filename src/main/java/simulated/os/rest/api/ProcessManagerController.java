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
public class ProcessManagerController {
	
	private static BlockTable blockTable = DataBase.getBlockTable();
	private static MemoryTable memoryTable = DataBase.getMemoryTable();
	private static JobTable jobTable = DataBase.getJobTable();
	private ProcessManager processManager = new ProcessManager();
	
	@CrossOrigin()
	@PutMapping("/processmanager/run")
	public ResponseEntity<Object> run(){
		processManager.runProcessors();
		return new ResponseEntity<>("ran",HttpStatus.OK);
	}
	
	@CrossOrigin()
	@GetMapping("/processmanager/getoutput")
	public ResponseEntity<Object> getOutPut(){	
		return new ResponseEntity<>(DataBase.getOutPut(),HttpStatus.OK);
	}
}
