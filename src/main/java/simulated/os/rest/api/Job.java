package main.java.simulated.os.rest.api;

import java.util.ArrayDeque;

//chnaged deque
public class Job<E> {
	private ArrayDeque<String> instructions = new ArrayDeque<String>();
	private int blockID;
	private int jobID;
	
	public Job() {
		this.blockID = -1;
		this.jobID = DataBase.getJobCounter().getAndIncrement();
	}
	
	public ArrayDeque<String> getInstructions(){
		return instructions;
	}
	
	public int getBlockID() {
		return blockID;
	}
	
	public int getJobID() {
		return jobID;
	}
	
	public void setInstructions(ArrayDeque<String> instructions) {
		this.instructions=instructions;
	}
	
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
	public String removeInstruction() {
		return instructions.remove();
	}
}
