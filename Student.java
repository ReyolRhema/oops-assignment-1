package org.student;

import org.department.Department;

public class Student extends Department{
  public void reyol() {
	  System.out.println("reyol details");}
  public static void main(String[] args) {
	Student student = new Student();
	
	student.reyol();
	student.collegeName();
	student.CollegeCode();
	student.CollegeRank();
	student.departmentName();
	  
  }
}
