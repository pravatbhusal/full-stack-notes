package com.pb24578.sms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.pb24578.sms.entity.Student;
import com.pb24578.sms.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}
	
	// Inject the StudentRepository bean
	@Autowired
	private StudentRepository studentRepository;
	
	// Runs when the application is started
	@Override
	public void run(String... args) throws Exception {
		// initializeStudents();
	}
	
	// Call once to create a set of students into the DB
	@SuppressWarnings("unused")
	private void initializeStudents() {
		// Create a student "Pravat Bhusal" and save it into the DB
		Student pravatStudent = new Student("Pravat", "Bhusal", "pravat.bhusal@gmail.com");
		studentRepository.save(pravatStudent);
		
		// Create a student "Bob Ryan" and save it into the DB
		Student bobStudent = new Student("Bob", "Ryan", "bob.ryan@gmail.com");
		studentRepository.save(bobStudent);
		
		// Create a student "Billy Joe" and save it into the DB
		Student billyStudent = new Student("Billy", "Joe", "billy.joe@gmail.com");
		studentRepository.save(billyStudent);
	}

}
