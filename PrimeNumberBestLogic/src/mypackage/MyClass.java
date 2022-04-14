package mypackage;

import java.util.Scanner;

public class MyClass 
{

	public static void main(String[] args) 
	{
		//variable declaration
				int input,count=0;
				String result;
				int i;
				Scanner obj = new Scanner(System.in);
				
				//Reading value from user
				System.out.println("Enter a number :");
				input=obj.nextInt();
				
				//best Logic
				for(i=2;i<input;i++)
				{
					if(input%i==0)
						break;
				}
				
				result=(i==input)? "Prime Number":"Not a Prime Number";
				System.out.println(result);
	}

}
