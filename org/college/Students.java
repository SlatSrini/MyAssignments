package org.college;

public class Students {
	
	public void getStudentInfo(int id)
	{
		System.out.println("Student ID : "+id);
	}
	
	public void getStudentInfo(int id,String name)
	{
		System.out.println("Student ID : "+id);
		System.out.println("Student Name : "+name);
	}
	
	public void getStudentInfo(int id,String name, long ph)
	{
		System.out.println("Student ID : "+id);
		System.out.println("Student Name : "+name);
		System.out.println("Phone Number : "+ph);
	}
	
	public void getStudentInfo(String email)
	{
		System.out.println("Student Email : "+email);

	}

	public static void main(String[] args) {
		
		Students stu = new Students();
		
		stu.getStudentInfo(4116012);
		System.out.println();
		stu.getStudentInfo(4116031,"Rajesh");
		System.out.println();
		stu.getStudentInfo(4101016,"Suresh",9924568213L);
		System.out.println();
		stu.getStudentInfo("xyz_test@gmail.com");

	}

}
