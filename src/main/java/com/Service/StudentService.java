package com.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.POJO.Student;
import com.Repository.StudentRepo;


@Service
public class StudentService {

	@Autowired
	StudentRepo repo;
	
	public ResponseEntity<?> addStudent(Student student){
		
		return new ResponseEntity<Integer>(repo.save(student).getId(),new HttpHeaders(),HttpStatus.OK);
		
	}

	public ResponseEntity<?> viewStudent() {
		// TODO Auto-generated method stub
		
		List <Student> list = repo.findAll();
		
		if(null==list)
			return ResponseEntity.notFound().build();
		
		return new ResponseEntity<List <Student>>(list,new HttpHeaders(),HttpStatus.OK);
	}
	
	
}
