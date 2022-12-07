package com.pb24578.sms.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.pb24578.sms.entity.Student;
import com.pb24578.sms.repository.StudentRepository;
import com.pb24578.sms.service.StudentService;

@Service // Indicates that this class handles the business logic
public class StudentServiceImpl implements StudentService {

	private StudentRepository studentRepository;
	
	public StudentServiceImpl(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}
	
	@Override
	public List<Student> getAllStudents() {
		return studentRepository.findAll();
	}
	
	@Override
	public Student getStudentById(Long id) {
		Optional<Student> student = studentRepository.findById(id);
		if (student.isPresent()) {
			return student.get();
		}
		return null;
	}

	@Override
	public Student saveStudent(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public Student updateStudent(Student student) {
		return studentRepository.save(student);
	}

}
