package main.java.simulated.os.rest.api;

public class Block {
	private int blockID;
	private int start;
	private int end;
	private int size;
	private boolean busy;
	
	public Block(int start, int end) {
		this.start = start;
		this.end = end;
		this.size = end - start + 1;
		this.busy = false;
		this.blockID = DataBase.getBlockCounter().getAndIncrement();
	}
	
	public int getBlockID() {
		return blockID;
	}
	
	public int getStart() {
		return start;
	}
	
	public int getEnd() {
		return end;
	}
	
	public int getSize() {
		return size;
	}
	
	public boolean getBusy() {
		return busy;
	}
	
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
