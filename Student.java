package Org.student;

import Org.college.College;

import Org.department.Department;

public class Student extends Department 
	{
		public void studentName()
		{
			System.out.println("student Name - Priya");
		}
		public void studentDept()
		{
			System.out.println("student Department - CSE");
		}
		public void studentID()
		{
			System.out.println("student ID - 1100");
		}
		public static void main(String[] args)
		{
			College c = new College();
			c.collegeCode();
			c.collegeName();
			c.collegeRank();
		   
			Department d = new Department();
			d.deptName();
			
			Student s = new Student();
			s.studentName();
			s.studentDept();
			s.studentID();
    	}
  }

