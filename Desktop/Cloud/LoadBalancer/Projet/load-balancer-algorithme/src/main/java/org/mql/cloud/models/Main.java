package org.mql.cloud.models;

import org.mql.cloud.algo.LoadBlancer;

public class Main {
	
	public static void main(String[] args) {
		LoadBlancer lb = new LoadBlancer();
		lb.calculateExpectedTimeOfTasks();
		lb.allocateTasksToAppropriateVm();
		System.out.println(lb.getResult());
	}
}
