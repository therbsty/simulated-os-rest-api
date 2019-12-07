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
	
	// call getBlock save the result
	// if result is -1 return false
	// else
	// set the jobs block id = to the result
	// add the job to the memory cells the block says
	// call updateBusy
	// call addToJob list
	public boolean loadJob(Job newJob) {
		int result;
		result = memoryTable.getBlock(newJob);
		if(result <= -1) {
			return false;
		}
		else {
			newJob.setJobID(result);
			memoryTable.add(newJob);
			updateBusy();
			addToJobList
			
		}
	}
	
	// return the block id of the smallest block the job will fit in
	// if it wont fit in any return -1
	///NEED TO WORK ON IT
	private static int getBlock(Job newJob) {
		if(Block) {
		newJob.getBlockID();
		}
		else {
			return -1;
		}
		
	}
	
	// set the block busy with that id to true
	private void updateBusy(int blockId) {
		blockId.setBusy(true);
		 
	}
	
	// call addJob with newJob and newJob's jobID as parameters
	private static void addToJobList(Job newJob) {}
	addJob(newJob);
	
	
}
