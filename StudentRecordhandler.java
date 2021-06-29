package com.studentRecord.main;

import java.util.List;

import com.studentRecord.bean.Student;

public interface StudentRecordhandler {

	public void insertStudent(List<Student> studentList );
	
	public void showStudentRecord(List<Student> studentList);
	
	public void deleteRecord(List<Student> studentList);
	
	public void showGrades(List<Student> studentList);
	
}