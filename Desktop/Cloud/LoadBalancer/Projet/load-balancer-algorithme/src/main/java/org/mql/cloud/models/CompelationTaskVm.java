package org.mql.cloud.models;

public class CompelationTaskVm {
	private int idTask;
	private int idVm;
	private long completionTime;
	private long violation;
	
	public CompelationTaskVm(int idTask, int idVm, long completionTime) {
		super();
		this.idTask = idTask;
		this.idVm = idVm;
		this.completionTime = completionTime;
	}
	
	public void setViolation(long violation) {
		this.violation = violation;
	}

	public int getIdTask() {
		return idTask;
	}

	public void setIdTask(int idTask) {
		this.idTask = idTask;
	}

	public int getIdVm() {
		return idVm;
	}

	public void setIdVm(int idVm) {
		this.idVm = idVm;
	}

	public long getCompletionTime() {
		return completionTime;
	}

	public void setCompletionTime(long completionTime) {
		this.completionTime = completionTime;
	}

	public long getViolation() {
		return violation;
	}
	
	
}

