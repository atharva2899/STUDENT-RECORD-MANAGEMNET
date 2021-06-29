package com.studentRecord.bean;

public class Subject {

	private String subjectName;
	private int marks;
	public String getSubjectName() {
		return subjectName;
	}
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Subject [subjectName=" + subjectName + ", marks=" + marks + "]";
	}
	
	
}
