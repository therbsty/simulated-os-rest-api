package main.java.simulated.os.rest.api;

import java.util.ArrayDeque;
import java.util.Deque;

//chnaged deque
public class Job<E> {
	private Deque<String> instructions = new ArrayDeque<String>();
	private int blockID;
	private int jobID;
	
	
	//set blockid =  -1 set jobid = atomic counter and inc it
	public Job() {
		
		this.blockID = -1;
		this.jobID = DataBase.getJobCounter().getAndIncrement();
	}
	
	public ArrayDeque<String> getInstructions(){
		return null;
	}
	
	public int getBlockID() {
		return blockID;
	}
	
	public int getJobID() {
		return jobID;
	}
	
	public void setInstructions(ArrayDeque<String> instructions) {}
	
	public void setBlockID(int blockID) {
		this.blockID = blockID;
	}
	
	public void setJobID(int jobID) {
		this.jobID = jobID;
	}
	
	// add instruction to back of dequeue
	public void addInstruction(String instruction) {
		instructions.add(instruction);
		}
	
	// remove and return front of dequeue
	public  void removeInstruction() {
		instructions.remove();
		instructions.getFirst();
	}

}
