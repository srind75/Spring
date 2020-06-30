package com.spring.beans;

public class User {
	private String uname;
	private String uaddr;
	private String uemail;

	

	public String getUname() {
		return uname;
	}



	public void setUname(String uname) {
		this.uname = uname;
	}



	public String getUaddr() {
		return uaddr;
	}



	public void setUaddr(String uaddr) {
		this.uaddr = uaddr;
	}



	public String getUemail() {
		return uemail;
	}



	public void setUemail(String uemail) {
		this.uemail = uemail;
	}



	public void display_User_Details() {
		System.out.println("User Details");
		System.out.println("---------------------");
		System.out.println("User Name :" + uname);
		System.out.println("User Address :" + uaddr);
		System.out.println("User Email :" + uemail);
	}
}
