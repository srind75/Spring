package com.annotation.autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;

public class Student {

	private String sid;
	private String sname;
	private Course scourse;
	
	@Autowired(required=true)
	//@Required
	@Qualifier("adv_Java")
	public void setScourse(Course scourse) {
	this.scourse = scourse;
	}

	public void getStudentDetails() {
		System.out.println("Student Details");
		System.out.println("--------------------");
		System.out.println("Student Id :" + sid);
		System.out.println("Student Name :" + sname);
		System.out.println("Course Details");
		System.out.println("----------------");
		System.out.println("Course Id :" + scourse.getCid());
		System.out.println("Course Name :" + scourse.getCname());
		System.out.println("Course Cost :" + scourse.getCcost());
	}

}
