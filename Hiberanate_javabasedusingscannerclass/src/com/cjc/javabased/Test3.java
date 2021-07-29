package com.cjc.javabased;

import java.util.Scanner;

import org.hibernate.Session;

public class Test3 {

public static void main(String[] args) {
	

	Session session=HiberateUtil.getsessionFactory().openSession();
	Student stu=new Student();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter rollno you want to delete");
	stu.setRollno(sc.nextInt());
	session.delete(stu);
	session.beginTransaction().commit();
}
}