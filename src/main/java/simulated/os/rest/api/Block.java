package main.java.simulated.os.rest.api;

public class Block {
	private int blockID;
	private int start;
	private int end;
	private int size;
	private boolean busy;
	
	public void Block(int blockID, int start, int end) {}
	
	public int getBlockID() {}
	
	public int getStart() {}
	
	public int getEnd() {}
	
	public int getSize() {}
	
	public boolean getBusy() {}
	
	public void setBlock(int blockID) {
		this.blockID = blockID;
	}
	
	public void setStart(int start) {
		this.start = start;
	}

	public void setEnd(int end) {
		this.end = end;
	}
	
	public void setSize(int size) {
		this.size = size;

	}
	
	public void setBusy(boolean busy) {
		this.busy = busy;

	}
}
