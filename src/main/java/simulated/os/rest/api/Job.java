package main.java.simulated.os.rest.api;

import java.util.ArrayDeque;

public class Job {
	private ArrayDeque<String> instructions;
	private int blockID;
	private int jobID;
	
	public Job(int blockID) {}
	
	public ArrayDeque<String> getInstructions(){}
	
	public int getBlockID() {
		return blockID;
	}
	
	public int getJobID() {
		return jobID;
	}
	
	public void setInstructions(ArrayDeque<String> instructions) {}
	
	public void setBlockID(int blockID) {}
	
	public void setJobID(int jobID) {}
	
	public void addInstruction(String instruction) {}
	
	public String removeInstruction() {}

}
