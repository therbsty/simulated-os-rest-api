package main.java.simulated.os.rest.api;

public class ProcessManager {
	private static BlockTable blockTable = DataBase.getBlockTable();
	private static MemoryTable memoryTable = DataBase.getMemoryTable();
	private static JobTable jobTable = DataBase.getJobTable();
	
	private int processor2TimeQuantum;
	private int processor2CurrentJob;
	private int processor2RemainingRuns;
	
	private String outPut;
	
	public ProcessManager() {
		processor2TimeQuantum = 4;
		processor2CurrentJob = -1;
		processor2RemainingRuns = 4;
		outPut= "No Jobs To Run";
		
	}
	
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
	public String getOutPut() {
		return outPut;
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

	public void setOutPut(String outPut) {
		this.outPut = outPut;
	}
	public void runProcessors() {
		Job runningJob = null;
		if(jobTable.getJobList().size()==0) {
			outPut = "No Jobs To Run";
		}
		else {
			if(processor2RemainingRuns==0 && jobTable.getJobList().higherKey(processor2CurrentJob)==null) {
				processor2CurrentJob = -1;
				runningJob = jobTable.getJobList().get(jobTable.getJobList().ceilingKey(processor2CurrentJob));
				processor2RemainingRuns=4;
			}
			else if(processor2RemainingRuns==0){
				runningJob = jobTable.getJobList().get(jobTable.getJobList().higherKey(processor2CurrentJob));
				processor2CurrentJob = runningJob.getJobID();
				processor2RemainingRuns=4;
			}
			else {
				runningJob = jobTable.getJobList().get(jobTable.getJobList().ceilingKey(processor2CurrentJob));
				processor2CurrentJob = runningJob.getJobID();
				processor2RemainingRuns--;
			}
			
			if(runningJob.getInstructions().size()==1) {
				outPut = runningJob.removeInstruction();
				ProcessManager.updateBusy(runningJob.getJobID());
				ProcessManager.removeJobFromMemory(runningJob.getJobID());
				ProcessManager.removeJobFromJobList(runningJob.getJobID());
				processor2RemainingRuns=4;
			}
			else {
				outPut = runningJob.removeInstruction();
			}
		}
	}
	
	private static void updateBusy(int jobID) {
		blockTable.getBlockList().get(jobTable.getJobList().get(jobID).getBlockID()).setBusy(false);
	}
	private static void removeJobFromMemory(int jobID) {
		Block blockToRemove = blockTable.getBlockList().get(jobTable.getJobList().get(jobID).getBlockID());
		for(int i=0; i<blockToRemove.getSize(); i++) {
			memoryTable.getMemoryList()[blockToRemove.getStart() + i] = "";
		}
	}
	
	private static void removeJobFromJobList(int jobID) {
		jobTable.getJobList().remove(jobID);
	}
}
