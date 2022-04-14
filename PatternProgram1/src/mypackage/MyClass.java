package mypackage;

import java.util.Scanner;

public class MyClass 
{
	public static void main(String[]  args)
	{
		int input;
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Enter a number how much lines you want to print : ");
		input=obj.nextInt();
		
		for(int i=1;i<=input;i++)
		{
			for(int j=1;j<=i;j++)
			System.out.print("* ");
			System.out.print("\n");
		}	
	
	}

}

