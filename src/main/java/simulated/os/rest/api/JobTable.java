package main.java.simulated.os.rest.api;

import java.util.TreeMap;

public class JobTable {
	private TreeMap<Integer,Job> jobList;
	
	public JobTable() {}
	
	public TreeMap<Integer,Job> getJobList(){}
	
	public void setJoblist(TreeMap<Integer,Job> jobList) {}
	
	// add a job to joblist using jobid as key and job as value
	public void addJob(Job job) {}
	
	//remove job from joblist by key(jobID)
	public void removeJob(int jobID) {}

}
