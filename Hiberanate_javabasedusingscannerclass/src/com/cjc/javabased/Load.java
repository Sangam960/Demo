package com.cjc.javabased;

import java.util.Scanner;

import org.hibernate.Session;

public class Load {

public static void main(String[] args) {
		
		Session session=HiberateUtil.getsessionFactory().openSession();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter rollno you want to 11 the data");
		int roll=sc.nextInt();
		Student stu=session.load(Student.class, roll);
		System.out.println(stu.getRollno());
		System.out.println(stu.getName());
		System.out.println(stu.getAddress());

}
}
