
package com.studentRecord.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.studentRecord.bean.Student;

public class MainApplication {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<Student> studentList = new ArrayList<Student>();
		
		StudentRecordhandler studentRecordhandler = new StudentRecordhandlerImpl();
		boolean isApplicationClosed = false;
		do {
		System.out.println("Please chooose the following option -: \n"
				+ "Press 1 to insert student records. \n"
				+ "Press 2 to view inserted records. \n"
				+ "Press 3 to delete the record. \n"
				+ "Press 4 to show grades of student \n"
				+ "Press any other to quit the application.");
		
		int choice = sc.nextInt();
			switch (choice)
			{
				case 1 :
					studentRecordhandler.insertStudent(studentList);
					break;
				case 2 :
					studentRecordhandler.showStudentRecord(studentList);
					break;
				case 3 :
					studentRecordhandler.deleteRecord(studentList);
					break;
				case 4 :
					studentRecordhandler.showGrades(studentList);
					break;
				default :
					isApplicationClosed = true;
					System.out.println("Thanks for using application!!! application is closed.");
					
			}
		}while(! isApplicationClosed);	
	}
}
