package main.java.simulated.os.rest.api;

public class MemoryManager {
	private BlockTable blockTable;
	private MemoryTable memoryTable;
	private JobTable jobTable;
	
	
	public boolean loadJob(Job newJob, int blockId) {}
	
	public int getBlock(Job newJob) {}
	
	public void updateBusy(int blockId) {}

	public void addToJobList(Job newJob, int blackId) {}
	
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
	
	
	
}
