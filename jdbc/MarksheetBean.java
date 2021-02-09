package com.rays.jdbc;

public class MarksheetBean {
    private int id ;
	private int rollno;
	private String fname;
	private String lname;
	private int phy;
	private int chm ;
	private int math ;
	 public MarksheetBean() {}
	 
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getRollno() {
		return rollno;
	}
	
	
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public int getPhy() {
		return phy;
	}
	public void setPhy(int phy) {
		this.phy = phy;
	}
	public int getChm() {
		return chm;
	}
	public void setChm(int chm) {
		this.chm = chm;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	 

}
