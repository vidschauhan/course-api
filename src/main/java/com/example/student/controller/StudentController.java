package com.example.student.controller;

import java.util.ArrayList;
import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.student.common.APIResponse;
import com.example.student.common.Student;
import com.example.student.service.StudentService;

@RestController
@RequestMapping("/course")
public class StudentController {
	
	@Autowired 
	StudentService studentService;
	
	@RequestMapping("booksList")
	public List<String> getList(){
		List<String> list = new ArrayList<>();
		list.add("Java The Complete Refrence");
		list.add("The ultimate guide on java 8");
		list.add("Apache Spark Haven");
		return list;
		
	}
	
	@RequestMapping(value = "students", method = RequestMethod.GET)
	public List<Student> getStudents() {
		return studentService.getStudentsList();
	}
	
	@RequestMapping(value = "/students/{name}", method = RequestMethod.GET)
	public Student getOnestudent(@PathVariable String name) {
		return studentService.getSpecificStudent(name);
		
	}
	
	@RequestMapping(value = "/addStudent", method = RequestMethod.POST)
	public APIResponse addStudentInfo(@RequestBody Student student) {
		APIResponse response = new APIResponse();

		if (null != student) {
			return studentService.addNewStudent(student);
		} else {
			response.setStatus(500);
			response.setMessage("Internal Server Error!");
		}
		return response;

	}
	
	@RequestMapping(value = "/deleteStudent", method = RequestMethod.DELETE)
	public APIResponse deleteStudentInfo(@RequestBody Student student) {
		APIResponse response = new APIResponse();

		if (null != student) {
			return studentService.deleteStudent(student);
		} else {
			response.setStatus(500);
			response.setMessage("Internal Server Error!");
		}
		return response;

	}
	

}
