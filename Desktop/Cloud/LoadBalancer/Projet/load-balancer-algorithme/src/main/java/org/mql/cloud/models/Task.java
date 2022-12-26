package org.mql.cloud.models;

import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Vector;

public class Task {
	private static int taskIdCounter = 0;
	private int taskId;
	private long lenght;
	private long deadline;
	private Date arrivaleTime;
	private long compelationTime;
	private List<CompelationTaskVm> ctvs;

	public Task() {
		lenght = (long)(Math.random()* 3000*400) + 1000;
		deadline = (long)(Math.random()* 3000) + 1000;
		arrivaleTime = new Date();
		taskId = taskIdCounter;
		taskIdCounter++;
		ctvs = new Vector<CompelationTaskVm>();
	}

	public Task(long lenght, long deadline, Date arrivaleTime, long compelationTime) {
		super();
		this.lenght = lenght;
		this.deadline = deadline;
		this.arrivaleTime = arrivaleTime;
		this.compelationTime = compelationTime;
		taskId = taskIdCounter;
		taskIdCounter++;
		ctvs = new Vector<CompelationTaskVm>();
	}
	/* pour savoir la MV qui correspond au meilleur compelation time */
	public CompelationTaskVm getAppropriateVm() {
		long min = ctvs.get(0).getCompletionTime();
		CompelationTaskVm appropriateVm = ctvs.get(0);
		for(int i = 1; i < ctvs.size();i++) {
			CompelationTaskVm ctv = ctvs.get(i);
			if(min > ctv.getCompletionTime()) {
				min = ctv.getCompletionTime();
				appropriateVm = ctv;
			}
		}
		return appropriateVm;
	}
	
	public long getLenght() {
		return lenght;
	}
	public void setLenght(long lenght) {
		this.lenght = lenght;
	}
	public long getDeadline() {
		return deadline;
	}
	public void setDeadline(long deadline) {
		this.deadline = deadline;
	}
	public Date getArrivaleTime() {
		return arrivaleTime;
	}
	public void setArrivaleTime(Date arrivaleTime) {
		this.arrivaleTime = arrivaleTime;
	}
	public long getCompelationTime() {
		return compelationTime;
	}
	public void setCompelationTime(long compelationTime) {
		this.compelationTime = compelationTime;
	}

	public int getTaskId() {
		return taskId;
	}

	public void setTaskId(int taskId) {
		this.taskId = taskId;
	}

	public List<CompelationTaskVm> getCtvs() {
		return ctvs;
	}

	public void setCtvs(List<CompelationTaskVm> ctvs) {
		this.ctvs = ctvs;
	}

	
	
	
}
