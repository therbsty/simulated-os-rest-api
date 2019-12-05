package main.java.simulated.os.rest.api;

public class MemoryTable {
	private String[] memoryList;
	
	public MemoryTable() {
		memoryList = new String[100];
		for (int i=0; i<memoryList.length; i++){
			memoryList[i] = "";
		}
	}
	
	public String[] getMemoryList() {
		return memoryList;
	}
	
	public void setMemoryList(String[] memoryList) {
		this.memoryList = memoryList;
	}
}
