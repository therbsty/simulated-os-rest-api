package main.java.simulated.os.rest.api;

public class Main {

	public static void main(String[] args) {
		Job newJob = new Job();
		newJob.addInstruction("in1");
		newJob.addInstruction("in2");
		MemoryManager.getBlock(newJob);
	}

}
