package net.codejava;

import org.springframework.data.repository.CrudRepository;

//import org.springframework.stereotype.Repository;

import net.codejava.Student;

public interface StudentRepository extends CrudRepository<Student, Integer>{
	
} 

