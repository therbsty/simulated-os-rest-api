package main.java.simulated.os.rest.api;

public class JobInstructions {
	private String[] instructions;
	public JobInstructions() {}
	public JobInstructions(String[] instructions) {
		this.instructions = instructions;
	}
	public String[] getInstructions() {
		return instructions;
	}
	public void setInstructions(String[] instructions) {
		this.instructions = instructions;
	}
}
