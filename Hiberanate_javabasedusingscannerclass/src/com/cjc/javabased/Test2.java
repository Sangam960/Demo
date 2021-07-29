package com.cjc.javabased;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Test2 {

	public static void main(String[] args) {
		
		Session session=HiberateUtil.getsessionFactory().openSession();
		Student stu=new Student();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter rollno you want to update");
		stu.setRollno(sc.nextInt());
		System.out.println("Enter name: ");
		stu.setName(sc.next());
		System.out.println("Enter address:");
		stu.setAddress(sc.next());
		session.update(stu);
		session.beginTransaction().commit();	
	}
}
