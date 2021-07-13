package com.samrat.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.samrat.demo.model.Student;


//JpaRepository provides some methods to use out of the box 
@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {

}
