package org.college;

public class Student extends Department {
	
	public void studentName(String name)
	{
		System.out.println("Student Name : "+name);
	}
	
	public void studentDept(String dept)
	{
		System.out.println("Student Departmrnt : "+dept);
	}
	
	public void studentid(int id)
	{
		System.out.println("Student ID : "+id);
	}

	public static void main(String[] args) {
		
		Student stu = new Student();
		
		stu.collegeName("Anna University");
		stu.collegeCode(8143);
		stu.collegeRank(3);
		stu.deptName("Electronic And Communication Engineering");
		stu.studentName("Avinash");
		stu.studentDept("ECE");
		stu.studentid(81431061);

	}

}
