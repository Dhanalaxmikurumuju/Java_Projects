package mypackage;

import java.util.Scanner;

public class MyClass 
{

	public static void main(String[] args) 
	{
		int input;
		Scanner obj = new Scanner(System.in);
		String result;
		
		System.out.println("Enter a number :");
		input = obj.nextInt();
		
		/*
		if(input%2==0)
			System.out.println("Even number");
		else
			System.out.println("Odd number");
		*/
		
		//Or 
		
		/*
		if(input%2==0)
			result="Even number";
		else
			result="Odd number";
		*/
		
		//Or using Ternary operator(Conditional)
	
		result=(input%2==0)?"Even Number":"Odd Number";
		System.out.println(result);
	}

}
