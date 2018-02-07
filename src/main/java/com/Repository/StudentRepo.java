package com.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.POJO.Student;


@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {

}
