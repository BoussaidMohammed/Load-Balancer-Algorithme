package org.mql.cloud.models;

import java.util.List;
import java.util.Vector;
import java.util.stream.Collectors;

public class Host {
	private int mips;
	private int usedMips;
	private int initialMips;
	List<VM> vms;
	
	public Host() {
		vms = new Vector<VM>();
		init();
	}

	private void init() {
		this.usedMips = 0;
		this.mips = 1000;
		this.initialMips = 500;
	}

	public Host(int mips, List<VM> vms) {
		vms = new Vector<VM>();
		this.mips = mips;
		this.vms = vms;
	}

	public int getMips() {
		return mips;
	}
	public void setMips(int mips) {
		this.mips = mips;
	}
	public List<VM> getVms() {
		return vms;
	}
	public void setVms(List<VM> vms) {
		this.vms = vms;
	}

	public VM getVmById(int id) {
		return vms.stream().filter(vm -> vm.getVmId() == id).collect(Collectors.toList()).get(0);
	}
	
	public int getUsedMips() {
		return usedMips;
	}
	
	public void setUsedMips(int usedMips) {
		this.usedMips = usedMips;
	}

	public int getInitialMips() {
		return initialMips;
	}

	public void setInitialMips(int initialMips) {
		this.initialMips = initialMips;
	}
	
	
	
}
