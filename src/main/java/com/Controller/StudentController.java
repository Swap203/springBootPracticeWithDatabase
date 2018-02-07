package com.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.POJO.Student;
import com.Service.StudentService;

@RestController
@RequestMapping("/students")
public class StudentController {

	@Autowired
	StudentService service;
	
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<?> viewStudent(){
		
		return service.viewStudent();
		
	}
	
	
	@RequestMapping(value="/add",method=RequestMethod.POST)
	public ResponseEntity<?> addStudent(@RequestBody Student student){		
		return service.addStudent(student);
		
	}
	
	
	
	
}
