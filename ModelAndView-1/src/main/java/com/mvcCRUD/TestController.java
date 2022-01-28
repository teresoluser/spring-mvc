package com.mvcCRUD;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.mvcCRUD.Student;
import com.mvcCRUD.Login;
import com.mvcCRUD.StudentService;

@Controller
public class TestController {
 @Autowired
 private StudentService service;
 
 List<String> courses; 
 
 @ModelAttribute
 public void preLoad() {
  courses = new ArrayList<String>();
  courses.add("C");
  courses.add("CPP");
  courses.add("Java");
 }
 @RequestMapping(value = "/" , method = RequestMethod.GET)
 public String home(Model model, Student student) {
  model.addAttribute("courses", courses);
  return "register";
 }
 
// @RequestMapping(value = "/save",method = RequestMethod.POST)
// public String register(@ModelAttribute("student") Student student, Model model) {
//  System.out.println("get coursess:::"+student.getCourse());
//  service.save(student);
//  return "welcome";
// }
 
 

 	
// @RequestMapping(value = "/" , method = RequestMethod.GET)
// public String login() {
// //model.addAttribute("email", courses);
//	 System.out.println(" Lonin service ");
// return "login";
// }
// 
//	
@RequestMapping(value = "/show" , method = RequestMethod.POST)
public String showLogin( @RequestParam(value = "email", required = false) String email,
                         @RequestParam(value = "password", required = false) String password, 
                         Login login,Model model) 
{
    
	System.out.println(" Email "+email);
	 System.out.println(" Password  "+password);
	 login.setEmail(email);
	 login.setPassword(password);
	 service.save1(login);
    return "show";
}
// 
//		 
//@RequestMapping(value = "/login" , method = RequestMethod.POST)
//public String home(@ModelAttribute("login") Login login, Model model) {
//	System.out.println(" Login Show  ");
//model.addAttribute("email", "aaaaaaaaa");
//return "wellcome";
//}
//
// 
// 
//@RequestMapping(value = "/save",method = RequestMethod.POST)
//public String register(@ModelAttribute("student") Student student, Model model) {
//System.out.println("get coursess:::"+student.getCourse());
//service.save(student);
//return "welcome";
//}	
 
}
