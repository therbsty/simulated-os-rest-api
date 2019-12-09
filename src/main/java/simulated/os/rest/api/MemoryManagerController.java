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
	private MemoryManager memorymanager = new MemoryManager(); 
	
	@CrossOrigin()
	@PostMapping("/memorymanager/newjob")
	public ResponseEntity<Object> addNewJob(@RequestBody JobInstructions jobInstructions){
		Job newJob = new Job();
		int i=0;
		while(i<jobInstructions.getInstructions().length && !(jobInstructions.getInstructions()[i].equals(""))) {
			newJob.addInstruction(jobInstructions.getInstructions()[i]);
			i++;
		}
		memorymanager.loadJob(newJob);
		return new ResponseEntity<>(newJob,HttpStatus.OK);
	}
	
	@CrossOrigin()
	@GetMapping("/memorymanager/getmemorytable")
	public ResponseEntity<Object> getMemoryTable(){
		return new ResponseEntity<>(memorymanager.getMemoryTable().getMemoryList(),HttpStatus.OK);
	}
	
	@CrossOrigin()
	@GetMapping("/memorymanager/getoutput")
	public ResponseEntity<Object> getOutPut(){	
		return new ResponseEntity<>(DataBase.getOutPut(),HttpStatus.OK);
	}
}