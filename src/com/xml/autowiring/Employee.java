package com.xml.autowiring;

public class Employee {
	
	private String eid;
	private String ename;
	private Address eaddr;
	private Account eacc;
	
	public String getEid() {
		return eid;
	}
	public void setEid(String eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public Address getEaddr() {
		return eaddr;
	}
	public void setEaddr(Address eaddr) {
		this.eaddr = eaddr;
	}
	public Account getEacc() {
		return eacc;
	}
	public void setEacc(Account eacc) {
		this.eacc = eacc;
	}
	
	public void getEmpDetails(){
		System.out.println("Employee Details");
		System.out.println("---------------------");
		System.out.println("Employee Id :"+eid);
		System.out.println("Employee Name :"+ename);
		System.out.println();
		System.out.println("Employee Address Details");
		System.out.println("--------------------------");
		System.out.println("House Number:"+eaddr.getHno());
		System.out.println("Street :"+eaddr.getStreet());
		System.out.println("City :"+eaddr.getCity());
		System.out.println("State :"+eaddr.getState());
		System.out.println();
		System.out.println("Employee Account Details");
		System.out.println("-------------------");
		System.out.println("Account NUmber :"+eacc.getAccNo());
		System.out.println("Account Name :"+eacc.getAccName());
		System.out.println("Account Type :"+eacc.getAccType());
		System.out.println("Account Balance:"+eacc.getBalance());
		}

}
