package com.cjc.javabased;

import java.util.Scanner;

import org.hibernate.Session;

public class Getdata {

	public static void main(String[] args) {
		
		Session session=HiberateUtil.getsessionFactory().openSession();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter rollno you want to get the data");
		int roll=sc.nextInt();
		Student stu=session.get(Student.class, roll);
		System.out.println(stu.getRollno());
		System.out.println(stu.getName());
		System.out.println(stu.getAddress());
	}
}
