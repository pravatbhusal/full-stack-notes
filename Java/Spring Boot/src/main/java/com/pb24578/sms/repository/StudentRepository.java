package com.pb24578.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pb24578.sms.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> { // JpaRepository is an API with CRUD, pagination, and sorting

}
