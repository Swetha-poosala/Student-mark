package org.marks;

import java.util.Scanner;

public class StudentMark {

  public static void main(String[] args) {

	Scanner s = new Scanner(System.in);
	Scanner s1 = new Scanner(System.in);
	
	System.out.println("Enter student Id : ");
	int studentId = s.nextInt();
	System.out.println("Student Id is "+studentId);
	
	System.out.println("Enter student name : ");
	String studentName = s1.nextLine();
	System.out.println("Student name is "+studentName);
	
	System.out.println("Enter your class");
	int clas = s.nextShort();
	System.out.println("Student class is "+clas);
	
	System.out.println("Enter student Mark1 : ");
	short mark1 = s.nextShort();
	System.out.println("Student mark1 is "+mark1);
	
	System.out.println("Enter student Mark2 : ");
	short mark2 = s.nextShort();
	System.out.println("Student mark2 is "+mark2);
	
	System.out.println("Enter student Mark3 : ");
	short mark3 = s.nextShort();
	System.out.println("Student mark3 is "+mark3);
	
	System.out.println("Enter student Mark4 : ");
	short mark4 = s.nextShort();
	System.out.println("Student mark4 is "+mark4);
	
	System.out.println("Enter student Mark5 : ");
	short mark5 = s.nextShort();
	System.out.println("Student mark5 is "+mark5);
	
	System.out.println("Total marks : 250");
	
}
}