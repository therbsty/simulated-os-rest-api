package main.java.simulated.os.rest.api;

public class MemoryManager {
	private BlockTable blockTable;
	private MemoryTable memoryTable;
	private JobTable jobTable;
	
	public int getBlockTable(Job newJob) {}
	
	public boolean loadJob(Job newJob, int blockId) {}
	
	public void updateBusy(int blockId) {}

	public void addoJobList(Job newJob, int blackId) {}
	
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
