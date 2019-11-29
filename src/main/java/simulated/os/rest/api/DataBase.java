package main.java.simulated.os.rest.api;

import java.util.concurrent.atomic.AtomicInteger;

public class DataBase {
	private static BlockTable blockTable = new BlockTable();
	private static MemoryTable memoryTable = new MemoryTable();
	private static JobTable jobTable = new JobTable();
	private static AtomicInteger blockCounter = new AtomicInteger();
	private static AtomicInteger jobCounter = new AtomicInteger();
	
	public static BlockTable getBlockTable() {
		return blockTable;
	}
	public static MemoryTable getMemoryTable() {
		return memoryTable;
	}
	public static JobTable getJobTable() {
		return jobTable;
	}
	public static AtomicInteger getBlockCounter() {
		return blockCounter;
	}
	public static AtomicInteger getJobCounter() {
		return jobCounter;
	}
	
	public void setBlockTable(blockTable blockTable) {
		this.blockTable = blockTable;
	}
	
	public void setMemoryTable(MemoryTable memoryTable) {
		this.memoryTable = memoryTable;
	}
	
	public void setJobTable(JobTable jobTable) {
		this.jobTable = jobTable;
	}
	
	public void setBlockCounter(AtomicInterger blockCounter) {
		this.blockCounter = blockCounter;
	}
	
	public void setJobCounter(AtomicInterger jobCounter) {
		this.jobCounter = jobCounter;
	}
}