package com.mj.bin;

public class Student {
	int sId;
	String sName;
	String tName;
	double marks;
	
	public Student (int sId, String sName, String tName, double marks)
	{
		this.sId= sId;
		this.sName=sName;
		this.tName=tName;
		this.marks=marks;
	}

	public String toString() {
		return "Student [sId=" + sId + ", sName=" + sName + ", tName=" + tName
				+ ", marks=" + marks + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

	public static void main(String[] args) 
	{
		Student ob=new Student(6,"a","b",53);
		System.out.println(ob.toString());
	}
}
