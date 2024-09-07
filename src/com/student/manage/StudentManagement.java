package com.student.manage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StudentManagement {

    public static void main(String[] args)throws IOException {

    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // Initialize the Scanner

        while (true) {
            System.out.println("1. Add Student");
            System.out.println("2. delete Students");
            System.out.println("3. Display Student");
            System.out.println("4. Exit");
            int c = Integer.parseInt(br.readLine());

            if(c==1)
            {
            	// add students.....

            	System.out.println("Enter user name : ");
            	String name=br.readLine();

            	System.out.println("Enter user phone : ");
            	String phone=br.readLine();

            	System.out.println("Enter user city : ");
            	String city=br.readLine();

            	//create student object to store student
            	
            	Student st=new Student(name, phone, city);
            	boolean answer=StudentDao.insertStudentToDB(st);
            	if (answer)
            	{
            		System.out.println("Student is added successfully.... ");
            	}else
            	{
            		System.out.println("Something went wrong try again.... ");
            	}
            	
            	System.out.println(st);

            }else if(c==2)
            {
            	// delete student
            	
            	System.out.println("Enter student id to delete: ");
            	int userId=Integer.parseInt(br.readLine());
            	boolean f=StudentDao.deleteStudent(userId);
            	if (f)
            	{
            		System.out.println("Student is deleted successfully.... ");
            	}else
            	{
            		System.out.println("Something went wrong try again.... ");
            	}
            	
            }else if(c==3)
            {
            	// display students....
            	
            	StudentDao.showAllStudent();
            	
            }else if(c==4)
            {
            	// exit....
            	
            	break;
            }else
            {

            }


        }
        System.out.println("Thank you for using my application....");
        System.out.println("see you soon....");
    }
}
