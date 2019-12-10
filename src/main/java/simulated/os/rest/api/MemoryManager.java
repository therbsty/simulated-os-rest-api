package main.java.simulated.os.rest.api;

public class MemoryManager {
	private static BlockTable blockTable = DataBase.getBlockTable();
	private static MemoryTable memoryTable = DataBase.getMemoryTable();
	private static JobTable jobTable = DataBase.getJobTable();
	
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
		MemoryManager.blockTable = blockTable;
	}
	
	public void setMemoryTable(MemoryTable memoryTable) {
		MemoryManager.memoryTable = memoryTable;
	}
	
	public void setJobTable(JobTable jobTable) {
		MemoryManager.jobTable = jobTable;
	}
	
	public boolean loadJob(Job newJob) {
		int blockid = MemoryManager.getBlock(newJob);
		if(blockid <= -1) {
			DataBase.setOutPut("Cant Load Job");
			return false;
		}
		else {
			newJob.setBlockID(blockid);
			String[] instructionArray = newJob.getInstructions().toArray(new String[newJob.getInstructions().size()]);
			for(int i=0; i<instructionArray.length; i++) {
				memoryTable.getMemoryList()[blockTable.getBlockList().get(blockid).getStart() + i] = instructionArray[i];
			}
			MemoryManager.updateBusy(blockid);
			MemoryManager.addToJobList(newJob);
			DataBase.setOutPut("Job "+newJob.getJobID()+" Was Loaded In Block "+blockid);
			return true;
		}
	}
	
	private static int getBlock(Job newJob) {
		int returnID = -1;
		int minSize = 99;
		Block[] blockarray = blockTable.getBlockList().values().toArray(new Block[blockTable.getBlockList().values().size()]);
		for (int i = 0; i<blockarray.length; i++) {
			if(blockarray[i].getSize()<minSize && blockarray[i].getSize()>=newJob.getInstructions().size() && blockarray[i].getBusy()==false) {
				minSize = blockarray[i].getSize();
				returnID = blockarray[i].getBlockID();
			}
		}
		return returnID;
	}
	
	private static void updateBusy(int blockId) {
		blockTable.getBlockList().get(blockId).setBusy(true);	 
	}
	
	private static void addToJobList(Job newJob) {
		jobTable.addJob(newJob);
	}
}
