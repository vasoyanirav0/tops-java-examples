package com.file;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

class Student implements Serializable
{
	int rno;
	String sname;
	double per;
	boolean result;
	public Student(int rno, String sname, double per, boolean result) {
		this.rno = rno;
		this.sname = sname;
		this.per = per;
		this.result = result;
	}
	public String toString() {
		return "Roll No : "+rno+"\nStudent Name : "+sname+"\nPercentage : "+per+"\nResult : "+result;
	}
}
public class SerializationDemo {

	public static void main(String[] args) throws Exception {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Roll No : ");
		int rno=sc.nextInt();
		System.out.print("Enter Student Name : ");
		String sname=sc.next();
		System.out.print("Enter Percentage : ");
		double per=sc.nextDouble();
		System.out.print("Enter Result : ");
		boolean result=sc.nextBoolean();
		
		Student s1=new Student(rno,sname,per,result);
		FileOutputStream fos=new FileOutputStream(sname);
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(s1);
		oos.flush();
		oos.close();
		System.out.println("Object Written Successfully");
		
		FileInputStream fis=new FileInputStream(sname);
		ObjectInputStream ois=new ObjectInputStream(fis);
		Student s2=(Student)ois.readObject();
		ois.close();
		System.out.println(s2);
	}
}
