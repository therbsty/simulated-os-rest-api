package main.java.simulated.os.rest.api;

import java.util.TreeMap;

public class BlockTable {
	private TreeMap<Integer,Block> blockList;
	
	public BlockTable() {
		this.blockList = new TreeMap<Integer,Block>();
		Block b1 = new Block(0,4);		//5
		Block b2 = new Block(5,14);		//10
		Block b3 = new Block(15,29);	//15
		Block b4 = new Block(30,49);	//20
		Block b5 = new Block(50,74);	//25
		Block b6 = new Block(75,99);	//25
		
		blockList.put(b1.getBlockID(), b1);
		blockList.put(b2.getBlockID(), b2);
		blockList.put(b3.getBlockID(), b3);
		blockList.put(b4.getBlockID(), b4);
		blockList.put(b5.getBlockID(), b5);
		blockList.put(b6.getBlockID(), b6);
	}
	
	public TreeMap<Integer,Block> getBlockList(){
		return this.blockList;
	}
	
	public void setBlockList(TreeMap<Integer, Block> blockList) {
		this.blockList = blockList;
	}
	

}
