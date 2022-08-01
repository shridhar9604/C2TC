package com.tns.client;

import com.tns.entity.Student;
import com.tns.service.StudentService;
import com.tns.service.StudentServiceimpl;

public class Client {
public static void main(String []args) {
	StudentService service =new StudentServiceimpl();
	Student student=new Student();
	student.setStudentId(100);
	student.setName("Sachin");
	service.addStudent(student);
	student=service.findStudentById(100);
	System.out.println("ID:"+student.getStudentId());
	System.out.println("Name:"+student.getName());
	student =service.findStudentById(100);
	student.setName("Sachin Tendulkar");
	service.updateStudent(student);
	student=service.findStudentById(100);
	service.removeStudent(student);
	System.out.println("End of program/Life cycle completed...");
	
	
	
	
}
}
