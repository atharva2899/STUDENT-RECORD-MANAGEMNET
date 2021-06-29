package com.studentRecord.bean;

import java.util.List;

public class Student {

	private int rollNo;
	private String name;
	private Addresss addresss;
	private List<Subject> subjectList;
	
	
	
	public List<Subject> getSubjectList() {
		return subjectList;
	}
	public void setSubjectList(List<Subject> subjectList) {
		this.subjectList = subjectList;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Addresss getAddresss() {
		return addresss;
	}
	public void setAddresss(Addresss addresss) {
		this.addresss = addresss;
	}
	
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", addresss=" + addresss + ", subjectList="
				+ subjectList + "]";
	}
	
	
	
	
}
