package main.java.simulated.os.rest.api;

import java.util.ArrayDeque;

public class Job {
	private ArrayDeque<String> instructions;
	private int blockID;
	private int jobID;
	
	//set blockid =  -1 set jobid = atomic counter and inc it
	public Job() {}
	
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
	
	// add instruction to back of dequeue
	public void addInstruction(String instruction) {}
	
	// remove and return front of dequeue
	public String removeInstruction() {}

}
