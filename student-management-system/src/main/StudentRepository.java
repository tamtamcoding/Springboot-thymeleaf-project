package com.springProject1.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springProject1.sms.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{
	

}
