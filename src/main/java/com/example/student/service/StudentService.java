package com.example.student.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.student.common.APIResponse;
import com.example.student.common.Student;

@Service
public class StudentService {

	private List<Student> studentList = new ArrayList<>(
			Arrays.asList(new Student("Vidit", "D1001", "MCA"), 
						new Student("Amit", "D1002", "B.tech"),
						new Student("Sam","D1003","Bsc")));
	

	public List<Student> getStudentsList() {
		return studentList;
	}
	
	public Student getSpecificStudent(String name) {
		return studentList.stream().filter(x -> x.getName().equals(name)).findFirst().get();
	}

	public APIResponse addNewStudent(Student student) {
		APIResponse response = new APIResponse();
		if(null!=student) {
			studentList.add(student);
			response.setStatus(200);
			response.setMessage("Student Added Successfully!");
		}else {
			response.setStatus(400);
			response.setMessage("Bad Request");
		}
		return response;
	}

	public APIResponse deleteStudent(Student student) {
		APIResponse response = new APIResponse();
		if(null!=student) {
			if(studentList.stream().anyMatch(x-> x.getName().equals(student.getName()))) {
			studentList.remove(student);
			response.setStatus(200);
			response.setMessage("Student removed Successfully!"); }
			else {
				response.setStatus(409);
				response.setMessage("Student not found!");
			}
		}else {
			response.setStatus(400);
			response.setMessage("Bad Request");
		}
		return response;
	}
	
}
