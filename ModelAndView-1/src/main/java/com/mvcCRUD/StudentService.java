package com.mvcCRUD;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.mvcCRUD.Student;
import com.mvcCRUD.StudentRepository;
@Service
public class StudentService {
 @Autowired
 private StudentRepository repository;
 @Autowired
 private LoginRepository loginRepository ;
 
 public void save(Student student) {
  repository.save(student);
 }
 
 public void save1(Login login) {
	 loginRepository.save(login);
	 }
}
