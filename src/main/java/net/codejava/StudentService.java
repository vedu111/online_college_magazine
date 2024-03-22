package net.codejava;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.codejava.Student;
import net.codejava.StudentRepository;

@Service
public class StudentService {
	@Autowired(required=true)
	StudentRepository studentRepository;

	public List<Student> getAll() {
		 return (List<Student>) studentRepository.findAll();
	}
	
	public Student getStudent(Integer id) {
		 return studentRepository.findById(id).get();
	}
	
	public void insert(Student student) {
		int max = 0;
		Iterable<Student> list = studentRepository.findAll();
		for(Student stud : list){
			if(stud.getId() > max) max = stud.getId();
		}
		student.setId(max + 1);
		studentRepository.save(student);
	}
	
	public void update(int id, Student newStudent) {
		Student student =  studentRepository.findById(id).get();
		student.setAuthor(newStudent.getAuthor());
		student.setMail(newStudent.getMail());
		student.setArticle(newStudent.getArticle());
		student.setTitle(newStudent.getTitle());
		studentRepository.save(student);
	}
	
	public void delete(int id) {
		Student student =  studentRepository.findById(id).get();
		studentRepository.delete(student);
	}
}

