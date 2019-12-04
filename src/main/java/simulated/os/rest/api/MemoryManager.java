package main.java.simulated.os.rest.api;

public class MemoryManager {
	private BlockTable blockTable;
	private MemoryTable memoryTable;
	private JobTable jobTable;
	
	public MemoryManager() {}
	
	public BlockTable getBlockTable() {
		return blockTable;
	}
	
	public MemoryTable getMemoryTable() {
		return memoryTable;
	}
	
	public JobTable getJobTable() {
		return jobTable;
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
	
	public boolean loadJob(Job newJob) {}
	
	private int getBlock(Job newJob) {}
	
	private void updateBusy(int blockId) {}
	
	private void addToJobList(Job newJob, int blockId) {}
	
}
