package com.studentRecord.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



import com.studentRecord.bean.Addresss;
import com.studentRecord.bean.Student;
import com.studentRecord.bean.Subject;

public class StudentRecordhandlerImpl implements StudentRecordhandler{

	@Override
	public void insertStudent(List<Student> studentList) {
		
		Scanner sc = new Scanner(System.in);
		Student student = new Student();
		Addresss addresss = new Addresss();
		Subject subject = null;
		List<Subject> subjectsList = new ArrayList<>();
		student.setAddresss(addresss);
		System.out.println("Enter Student Roll No");
		student.setRollNo(sc.nextInt()); 
		
		System.out.println("Enter Student Name ");
		student.setName(sc.next()); 
		
		System.out.println("Enter Student City ");
		student.getAddresss().setCity(sc.next()); 
		
		System.out.println("Enter Student State ");
		student.getAddresss().setState(sc.next()); 
		
		System.out.println("Enter Student Country ");
		student.getAddresss().setCountry(sc.next()); 
		
		System.out.println("Enter Student Pin code ");
		student.getAddresss().setPincode(sc.nextInt()); 
		
		System.out.println("Enter number of subjects");
		int num = sc.nextInt();
		for(int i=0;i<num;i++)
		{
			subject = new Subject();
			System.out.println("Enter name of subjects");
			subject.setSubjectName(sc.next());
			System.out.println("Enter marks of subjects");
			subject.setMarks(sc.nextInt());
			subjectsList.add(subject);
		}
		student.setSubjectList(subjectsList);
		studentList.add(student);
	}
		
	@Override
	public void showStudentRecord(List<Student> studentList) {

		for(int i=0;i<studentList.size();i++)
		{
			System.out.println(studentList.get(i).toString());
		}
		
	}

	@Override
	public void deleteRecord(List<Student> studentList) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter roll no of student you want to remove");
		int rollNo= sc.nextInt();
		Student student = null;
		for(Student st : studentList)
		{
			if(st.getRollNo()==rollNo)
			{
				student = st;
				break;
			}
		}
		studentList.remove(student);
		
	}

	@Override
	public void showGrades(List<Student> studentList) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter roll no of student you want to check grades");
		int rollNo= sc.nextInt();
		Student student = null;
		for(Student st : studentList)
		{
			if(st.getRollNo()==rollNo)
			{
				student = st;
				break;
			}
		}
		
		int marks = 0;
		int count=0;
		for(Subject subject : student.getSubjectList())
		{
			marks +=subject.getMarks();
			count++;
		}
		int totalMarks = (count*100);
		int percentage = (marks*100/totalMarks);
		System.out.println(percentage);
		System.out.println("Grade of Student is "+gradeSystem(percentage));
	}
	
	private String gradeSystem(int percentage)
	{
		String grade = null;
		
		if(percentage>=75)
		{
			grade="A";
		}
		else if(percentage>=65)
		{
			grade="B";
		}
		else if(percentage>=55)
		{
			grade="C";
		}
		else if(percentage>=45)
		{
			grade="D";
		}
		else if (percentage>=35)
		{
			grade="E";
		}
		else {
			grade ="F";
		}
		
		
		return grade;
	}
}
