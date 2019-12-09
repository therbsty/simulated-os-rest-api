package main.java.simulated.os.rest.api;


public class DataBase {
	private static BlockTable blockTable = new BlockTable();
	private static MemoryTable memoryTable = new MemoryTable();
	private static JobTable jobTable = new JobTable();
	private static int blockCounter = 0;
	private static int jobCounter = 0;
	private static String outPut = "NO OutPut Yet";
	
	public static BlockTable getBlockTable() {
		return blockTable;
	}
	public static MemoryTable getMemoryTable() {
		return memoryTable;
	}
	public static JobTable getJobTable() {
		return jobTable;
	}
	public static int getBlockCounter() {
		int blockc=blockCounter;
		blockCounter++;
		return blockc;
	}
	public static int getJobCounter() {
		int jobc=blockCounter;
		blockCounter++;
		return jobc;
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
	
	public static void setBlockCounter(int blockCounter) {
		DataBase.blockCounter = blockCounter;
	}
	
	public static void setJobCounter(int jobCounter) {
		DataBase.jobCounter = jobCounter;
	}
	public static void setOutPut(String outPut) {
		DataBase.outPut = outPut;
	}
}