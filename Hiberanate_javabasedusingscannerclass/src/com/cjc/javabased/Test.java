package com.cjc.javabased;

import java.util.Scanner;

import org.hibernate.Session;

public class Test {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Session session=HiberateUtil.getsessionFactory().openSession();
		Student stu=new Student();
	System.out.println("Enter rollno");
		stu.setRollno(sc.nextInt());
		System.out.println("Enter name: ");
		stu.setName(sc.next());
		System.out.println("Enter address:");
		stu.setAddress(sc.next());
		session.save(stu);
		session.beginTransaction().commit();
	
		
		
		
		
		
		
		
		
		
		
		
		
// TO get data from student table
	/*	Student stu1=session.load(Student.class,1);
		System.out.println(stu1.getRollno());
		System.out.println(stu1.getName());
		System.out.println(stu1.getAddress());
		*/
		
		
		
	}
	
}
