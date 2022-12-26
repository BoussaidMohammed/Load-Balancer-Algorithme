package org.mql.cloud.models;

import java.util.List;
import java.util.Vector;

public class VM {
	private static int vmIdCounter = 0;
	private int vmId;
	private int mips;
	private List<Task> cloudlets;
	
	public VM(int mips) {
		this.mips = mips;
		init();
	}

	private void init() {
		vmId = vmIdCounter;
		vmIdCounter++;
		cloudlets = new Vector<Task>();
	}

	public void addTask(Task task) {
		cloudlets.add(task);
	}
	
	public int getVmId() {
		return vmId;
	}

	public int getMips() {
		return mips;
	}

	public void setMips(int mips) {
		this.mips = mips;
	}

	public List<Task> getCloudlets() {
		return cloudlets;
	}

	public void setCloudlets(List<Task> cloudlets) {
		this.cloudlets = cloudlets;
	}
	
	
}
