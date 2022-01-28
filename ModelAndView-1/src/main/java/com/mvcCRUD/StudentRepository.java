package com.mvcCRUD;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.mvcCRUD.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{
}
