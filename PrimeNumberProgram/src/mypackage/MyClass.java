package mypackage;

import java.util.Scanner;

public class MyClass 
{

	public static void main(String[] args) 
	{
		//variable declaration
		int input,count=0;
		String result;
		Scanner obj = new Scanner(System.in);
		
		//Reading value from user
		System.out.println("Enter a number :");
		input=obj.nextInt();
		
		//Actual Logic
		for(int i=1;i<=input;i++)
		{
			if(input%i==0)
				count++;
		}
		
		/*
		if(count==2)
			System.out.println("Prime Number");
		else
			System.out.println("Not a Prime Number");
		*/
		
		//Or 
		
		result=(count==2)?"Prime Number":"Not a Prime Number";
		System.out.println(result);
			
	}

}


