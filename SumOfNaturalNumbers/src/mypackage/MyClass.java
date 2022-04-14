package mypackage;

import java.util.Scanner;

public class MyClass 
{

	public static void main(String[] args)
	{
		int input,sum=0;
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Enter a number :");
		input=obj.nextInt();
		
		for(int i=1;i<=input;i++)      
			sum+=i;               //(or) sum=sum+i;
		
		System.out.println("The sum of all numbers upto "+input+" is :" +sum);
			
	 }

}
