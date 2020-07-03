package com.userBean;

public class student {
	
	private String name;
	private String rollNo;
	private String city;
	public student(String name, String rollNo, String city) {
		super();
		this.name = name;
		this.rollNo = rollNo;
		this.city = city;
	}
	public student() {
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRollNo() {
		return rollNo;
	}
	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
}
