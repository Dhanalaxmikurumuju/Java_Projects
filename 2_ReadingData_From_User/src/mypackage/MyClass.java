package mypackage;

import java.util.Scanner;

public class MyClass {

	public static void main(String[] args)
	{
		// Variable declaration
		String name;
		int age;
		float salary;
		
		//Scanner class object creation
		Scanner obj = new Scanner(System.in);
		
		//Reading data from User
		System.out.println("Enter your Name : ");
		name = obj.nextLine();
		
		System.out.println("Enter Your Age : ");
		age = obj.nextInt();
		
		System.out.println("Enter your salary : ");
		salary = obj.nextFloat();
		
		System.out.println("Name = "+name);
		System.out.println("Age = " +age);
		System.out.println("Salary = "+salary);

	}

}
