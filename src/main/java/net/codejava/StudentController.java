package net.codejava;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import net.codejava.Student;
import net.codejava.StudentService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletResponse;

@Controller
public class StudentController {

	@Autowired(required=true)
	private StudentService studentService;
	
	@GetMapping("/getAll")
	public String getAll(Model model) {
		List<Student> stlist = studentService.getAll();
		model.addAttribute("students", stlist);
		return "students";
	}
	
	@GetMapping("/addNew")
	public String newStudent(Model model) {
		Student student = new Student();
		model.addAttribute("student", student);
		return "add-student";
    }
	
	
	@PostMapping("/saveNew")
	public String insertStudent(@ModelAttribute(value = "student") Student student) {
	    studentService.insert(student);
	    return "article_sucess";
	}

	
	
	
	  
	 	
}

