package com.muchiri.student.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.muchiri.student.entity.Student;
import com.muchiri.student.repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepository studentRepository;
	

	public Student registerStudent(Student student) {
		
		return studentRepository.save(student);
		
	}
	
	public List<Student> getStudents(){
		return (List<Student>) studentRepository.findAll();
	}
	
	public void deleteStudent(Integer id) {
		studentRepository.deleteById(id);
	}
	
	public Student updateStudent(Student student) {
		Integer rollNumber= student.getRollNo();
		Student std=studentRepository.findById(rollNumber).get();
		std.setName(student.getName());
		std.setAddress(student.getAddress());
		std.setPercentage(student.getPercentage());
		return studentRepository.save(std);
				
	}

}
