package com.ioc.constructor.di;

public class Course {

	private String cid;
	private String cname;
	private int ccost;

	public Course(String cid, String cname, int ccost) {
		this.cid = cid;
		this.cname = cname;
		this.ccost = ccost;
	}

	public void getCourseDetails() {
		System.out.println("Course Details");
		System.out.println("-------------------");
		System.out.println("Course Id :" + cid);
		System.out.println("Course Name :" + cname);
		System.out.println("Course Cost :" + ccost);
	}
}

/*
Constructor Dependency Injection
If we inject dependent values to the Bean object through Constructor 
then this type of Dependency Injection is called as "Constructor Dependency Injection".
If we want to use constructor dependency injection in SPring applications , 
first we have to declare the respective parameterized constructor in the corresponmding bean class 
then we have to declare that constructor arguments in spring configuration file by using the 
following tags.
*/