package com.muchiri.student.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.muchiri.student.entity.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Integer> {

}
