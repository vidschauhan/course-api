package com.example.student.common;

public class Student {

	private String name;
	private String section;
	private String branch;
	
	public Student() {};
	public Student(String name, String section, String branch) {
		super();
		this.name = name;
		this.section = section;
		this.branch = branch;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSection() {
		return section;
	}
	public void setSection(String section) {
		this.section = section;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
}
