package com.pb24578.sms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.pb24578.sms.entity.Student;
import com.pb24578.sms.service.StudentService;

@Controller // Indicates that this class is an HTTP request handler
public class StudentController {
	
	private StudentService studentService;
	
	public StudentController(StudentService studentService) {
		super();
		this.studentService = studentService;
	}
	
	/**
	 * GET end-point that returns an HTML view with the list of students.
	 * 
	 * @return View with the list of students
	 */
	@GetMapping("/students")
	public String listStudents(Model model) {
		model.addAttribute("students", studentService.getAllStudents());
		return "students"; // Returns the students.html Thymeleaf template located in the src/main/resources/templates folder
	}
	
	/**
	 * GET end-point that returns an HTML view to create a new student.
	 * 
	 * @return View with form that creates a new student
	 */
	@GetMapping("/students/new")
	public String createStudentForm(Model model) {
		// Create a new object to hold student form data
		Student newStudent = new Student();
		model.addAttribute("student", newStudent);
		return "create_student";
	}
	
	/**
	 * GET end-point that returns an HTML view to edit a student form.
	 * 
	 * @return View with form that updates a student
	 */
	@GetMapping("/students/edit/{id}")
	public String editStudentForm(@PathVariable Long id, Model model) {
		model.addAttribute("student", studentService.getStudentById(id));
		return "edit_student";
	}
	
	/**
	 * POST end-point that creates a new student object.
	 * 
	 * @return
	 */
	@PostMapping("/students")
	public String saveStudent(@ModelAttribute("student") Student student) {
		studentService.saveStudent(student);
		return "redirect:/students"; // Re-directs to the /students end-point
	}
	

	@PostMapping("/students/{id}")
	public String updateStudent(@PathVariable Long id, @ModelAttribute("student") Student student, Model model)  {
		// Get the student by its id
		Student existingStudent = studentService.getStudentById(id);
		
		// Update the student's fields with the values from the form
		existingStudent.setFirstName(student.getFirstName());
		existingStudent.setLastName(student.getLastName());
		existingStudent.setEmail(student.getEmail());
		studentService.updateStudent(existingStudent);
		
		return "redirect:/students";
	}
}
