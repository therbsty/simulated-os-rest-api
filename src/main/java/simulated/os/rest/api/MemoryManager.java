package main.java.simulated.os.rest.api;

public class MemoryManager {
	private BlockTable blockTable;
	private MemoryTable memoryTable;
	private JobTable jobTable;
	
	public int getBlock(Job newJob) {}
	
	public boolean loadJob(Job newJob, int blockId) {}
	
	public void updateBusy(int blockId) {}

	public void addoJobList(Job newJob, int blackId) {}
	
	public BlockTable getBlockTable() {}
	
	public MemoryTable getMemoryTable() {}
	
	public JobTable getJobTable() {}
	
	public void setBlockTable(BlockTable blockTable) {}
	
	public void setMemoryTable(MemoryTable memoryTable) {}
	
	public void setJobTable(JobTable jobTable) {}
}
