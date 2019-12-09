package main.java.simulated.os.rest.api;

import java.util.concurrent.atomic.AtomicInteger;

public class DataBase {
	private static BlockTable blockTable = new BlockTable();
	private static MemoryTable memoryTable = new MemoryTable();
	private static JobTable jobTable = new JobTable();
	private static AtomicInteger blockCounter = new AtomicInteger();
	private static AtomicInteger jobCounter = new AtomicInteger();
	private static String outPut = "";
	
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
	public static String getOutPut() {
		return outPut;
	}
	
	public static void setBlockTable(BlockTable blockTable) {
		DataBase.blockTable = blockTable;
	}
	
	public static void setMemoryTable(MemoryTable memoryTable) {
		DataBase.memoryTable = memoryTable;
	}
	
	public static void setJobTable(JobTable jobTable) {
		DataBase.jobTable = jobTable;
	}
	
	public static void setBlockCounter(AtomicInteger blockCounter) {
		DataBase.blockCounter = blockCounter;
	}
	
	public static void setJobCounter(AtomicInteger jobCounter) {
		DataBase.jobCounter = jobCounter;
	}
	public static void setOutPut(String outPut) {
		DataBase.outPut = outPut;
	}
}