package com.springmvcprogram.model;

public class FamilyDetailsModel {
	
	private int fid;
	private String name;
	private int age;
	private long aadhar;
	private String pan;
	private long mobile;
	private String email;
	private String city;
	public FamilyDetailsModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public FamilyDetailsModel(String name, int age, long aadhar, String pan, long mobile, String email, String city) {
		super();
		this.name = name;
		this.age = age;
		this.aadhar = aadhar;
		this.pan = pan;
		this.mobile = mobile;
		this.email = email;
		this.city = city;
	}
	public FamilyDetailsModel(int fid, String name, int age, long aadhar, String pan, long mobile, String email,
			String city) {
		super();
		this.fid = fid;
		this.name = name;
		this.age = age;
		this.aadhar = aadhar;
		this.pan = pan;
		this.mobile = mobile;
		this.email = email;
		this.city = city;
	}
	public int getFid() {
		return fid;
	}
	public void setFid(int fid) {
		this.fid = fid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public long getAadhar() {
		return aadhar;
	}
	public void setAadhar(long aadhar) {
		this.aadhar = aadhar;
	}
	public String getPan() {
		return pan;
	}
	public void setPan(String pan) {
		this.pan = pan;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	

}
