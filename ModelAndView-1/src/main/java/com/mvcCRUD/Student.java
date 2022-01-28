package com.mvcCRUD;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "student")

public class Student {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private int id;
 @Column(name = "first_name")
 private String firstName;
 @Column(name = "last_name")
 private String lastName;
 @Column(name = "gender")
 private String gender;
 @Column(name = "course")
 private String course;
 @Column(name = "email")
 private String email;
 @Column(name = "password")
 private String password;
 @Column(name = "mobile_number")
 private String mobileNumber;
 @Column(name = "dob")
 private String dob;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getCourse() {
	return course;
}
public void setCourse(String course) {
	this.course = course;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getMobileNumber() {
	return mobileNumber;
}
public void setMobileNumber(String mobileNumber) {
	this.mobileNumber = mobileNumber;
}
public String getDob() {
	return dob;
}
public void setDob(String dob) {
	this.dob = dob;
}
 
 
 
}
