package com.springProject1.sms.service;

import java.util.List;

import com.springProject1.sms.entity.Student;

public interface StudentService {
List<Student> getAllStudents();
	
	Student saveStudent(Student student);
	
	Student getStudentById(Long id);
	
	Student updateStudent(Student student);
	
	void deleteStudentById(Long id);

}
