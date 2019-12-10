package main.java.simulated.os.rest.api;

import java.util.ArrayDeque;

public class Job {
	private ArrayDeque<String> instructions = new ArrayDeque<String>();
	private int blockID;
	private int jobID;
	
	public Job() {
		this.blockID = -1;
		this.jobID = DataBase.getJobCounter();
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
	
	public void addInstruction(String instruction) {
		instructions.add(instruction);
		}
	
	public String removeInstruction() {
		return instructions.remove();
	}
}
