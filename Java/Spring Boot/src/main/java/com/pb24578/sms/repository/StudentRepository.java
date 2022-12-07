package com.pb24578.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pb24578.sms.entity.Student;

// JpaRepository is an API with CRUD, pagination, and sorting
// By default, Spring will create a Bean for StudentRepository using the SimpleJpaRepository implementation
public interface StudentRepository extends JpaRepository<Student, Long> {

}
