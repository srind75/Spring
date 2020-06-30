package com.xml.autowiring;

public class EmployeeConst {
	
	private String eid;
	private String ename;
	private Address eaddr;
	private Account eacc;
	
	public EmployeeConst(String eid, String ename, Address eaddr, Account eacc) {
	
		this.eid = eid;
		this.ename = ename;
		this.eaddr = eaddr;
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
