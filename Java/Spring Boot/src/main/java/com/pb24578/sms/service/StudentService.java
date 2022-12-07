package com.pb24578.sms.service;

import java.util.List;

import com.pb24578.sms.entity.Student;

public interface StudentService {
	List<Student> getAllStudents();
	Student getStudentById(Long id);
	Student saveStudent(Student student);
	Student updateStudent(Student student);
}
