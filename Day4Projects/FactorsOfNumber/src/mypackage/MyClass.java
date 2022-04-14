package mypackage;

import java.util.Scanner;

public class MyClass
{

	public static void main(String[] args)
	{
		int n;
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Enter a number :");
		n = obj.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
				System.out.println(i);
		}	
	}

}
