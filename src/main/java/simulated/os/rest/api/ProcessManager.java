package main.java.simulated.os.rest.api;

public class ProcessManager {
	private BlockTable blockTable;
	private MemoryTable memoryTable;
	private JobTable jobTable;
	
	private int processor2TimeQuantum;
	private int processor2CurrentJob;
	private int processor2RemainingRuns;
	
	public ProcessManager() {}
	
	public BlockTable getBlockTable() {
		return blockTable;
	}
	
	public MemoryTable getMemoryTable() {
		return memoryTable;
	}
	
	public JobTable getjobTable() {
		return jobTable;
	}
	
	public int getProcessor2TimeQuantum() {
		return processor2TimeQuantum;
	}
	
	public int getProcessor2CurrentJob() {
		return processor2CurrentJob;
	}
	
	public int getProcessor2RemainingRuns() {
		return processor2RemainingRuns;
	}
	
	public void setBlockTable(BlockTable blockTable) {
		this.blockTable = blockTable;
	}
	
	public void setMemoryTable(MemoryTable memoryTable) {
		this.memoryTable = memoryTable;
	}
	
	public void setJobTable(JobTable jobTable) {
		this.jobTable = jobTable;
	}
	
	public void setProcessor2TimeQuantum(int processor2TimeQuantum) {
		this.processor2TimeQuantum = processor2TimeQuantum;
		
	}

	public void setProcessor2CurrentJob(int processor2CurrentJob) {
		this.processor2CurrentJob = processor2CurrentJob;
		
	}
	
	public void setProcessor2RemainingRuns(int processor2RemainingRuns) {
		this.processor2RemainingRuns = processor2RemainingRuns;
		
	}

	public void runProcessors() {}
	
	private void updateBusy(int jobID) {}
	
	private void removeJobFromMemory(int jobID) {}
	
	private void removeJobFromJobList(int jobID) {}

}
