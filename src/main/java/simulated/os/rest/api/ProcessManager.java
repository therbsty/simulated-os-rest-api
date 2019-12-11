package main.java.simulated.os.rest.api;

public class ProcessManager {
	private static BlockTable blockTable = DataBase.getBlockTable();
	private static MemoryTable memoryTable = DataBase.getMemoryTable();
	private static JobTable jobTable = DataBase.getJobTable();
	
	private int processor2TimeQuantum;
	private int processor2CurrentJob;
	private int processor2RemainingRuns;
	
	public ProcessManager() {
		processor2TimeQuantum = 4;
		processor2CurrentJob = -1;
		processor2RemainingRuns = 4;	
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
	
	public void setBlockTable(BlockTable blockTable) {
		ProcessManager.blockTable = blockTable;
	}
	
	public void setMemoryTable(MemoryTable memoryTable) {
		ProcessManager.memoryTable = memoryTable;
	}
	
	public void setJobTable(JobTable jobTable) {
		ProcessManager.jobTable = jobTable;
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
	public void runProcessors() {
		Job runningJob = null;
		if(jobTable.getJobList().size()==0) {
			DataBase.setOutPut("No Jobs To Run");
		}
		else {
			
			// last job ran 4 instructions and was last job on list
			if(processor2RemainingRuns == 0 && jobTable.getJobList().higherKey(processor2CurrentJob) == null) {
				processor2CurrentJob = -1; 
				runningJob = jobTable.getJobList().get(jobTable.getJobList().ceilingKey(processor2CurrentJob));
				processor2CurrentJob = runningJob.getJobID();
				processor2RemainingRuns=processor2TimeQuantum;
			}
			
			// last job finished and was last job on list
			else if(jobTable.getJobList().get(processor2CurrentJob)==null && jobTable.getJobList().higherKey(processor2CurrentJob) ==null){
				processor2CurrentJob = -1;
				runningJob = jobTable.getJobList().get(jobTable.getJobList().ceilingKey(processor2CurrentJob));
				processor2CurrentJob = runningJob.getJobID();
				processor2RemainingRuns = processor2TimeQuantum;
			}
			
			// last job ran 4 instructions and was not the last job on the list
			else if(processor2RemainingRuns == 0){
				runningJob = jobTable.getJobList().get(jobTable.getJobList().higherKey(processor2CurrentJob));
				processor2CurrentJob = runningJob.getJobID();
				processor2RemainingRuns = processor2TimeQuantum;
			}
			
			// last job finished and was not last job on list
			else if(jobTable.getJobList().get(processor2CurrentJob)==null){
				runningJob = jobTable.getJobList().get(jobTable.getJobList().higherKey(processor2CurrentJob));
				processor2CurrentJob = runningJob.getJobID();
				processor2RemainingRuns = processor2TimeQuantum;
			}
			
			// current job is not on the last instruction and has remaining runs or startup
			else {
				runningJob = jobTable.getJobList().get(jobTable.getJobList().ceilingKey(processor2CurrentJob));
				processor2CurrentJob = runningJob.getJobID();
			}
			
			// current job is on last instruction
			if(runningJob.getInstructions().size()==1) {
				DataBase.setOutPut("Job "+runningJob.getJobID()+" Ran Instruction "+runningJob.removeInstruction()+" And Finished");
				ProcessManager.updateBusy(runningJob.getJobID());
				ProcessManager.removeJobFromMemory(runningJob.getJobID());
				ProcessManager.removeJobFromJobList(runningJob.getJobID());
				processor2RemainingRuns = processor2TimeQuantum;
			}
			// current job is not on last instruction
			else {
				processor2RemainingRuns--;
				DataBase.setOutPut("Job "+runningJob.getJobID()+" Ran Instruction "+runningJob.removeInstruction());
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
