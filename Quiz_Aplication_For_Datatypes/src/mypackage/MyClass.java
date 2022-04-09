package mypackage;

import java.util.Scanner;

public class MyClass 
{

	public static void main(String[] args)
	{
		String name;
		int score=0 ,ans;
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Enter your name : ");
		name=obj.nextLine();
		
		System.out.println("***************************************");
		System.out.println("Hi  "+name+" , Welcome to Quiz");
		System.out.println("***************************************");
		
		System.out.println("Q1.What is the range of byte in java ");
		System.out.println("1) 1 byte  2) 2 bytes 3) 4 bytes 4) 8 bytes");
		System.out.println("Enter Your choice :");
		ans=obj.nextInt();
		if(ans==1)
			score=score+10;
		
		System.out.println("Q2.What is the range of short in java ");
		System.out.println("1) 1 byte  2) 2 bytes 3) 4 bytes 4) 8 bytes");
		System.out.println("Enter Your choice :");
		ans=obj.nextInt();
		if(ans==2)
			score=score+10;
		
		System.out.println("Q3.What is the range of int in java ");
		System.out.println("1) 1 byte  2) 2 bytes 3) 4 bytes 4) 8 bytes");
		System.out.println("Enter Your choice :");
		ans=obj.nextInt();
		if(ans==3)
			score=score+10;
		
		System.out.println("Q4.What is the range of long in java ");
		System.out.println("1) 1 byte  2) 2 bytes 3) 4 bytes 4) 8 bytes");
		System.out.println("Enter Your choice :");
		ans=obj.nextInt();
		if(ans==4)
			score=score+10;
		
		System.out.println("Q5.What is the range of float in java ");
		System.out.println("1) 1 byte  2) 2 bytes 3) 4 bytes 4) 8 bytes");
		System.out.println("Enter Your choice :");
		ans=obj.nextInt();
		if(ans==3)
			score=score+10;
		
		System.out.println("Q6.What is the range of double in java ");
		System.out.println("1) 1 byte  2) 2 bytes 3) 4 bytes 4) 8 bytes");
		System.out.println("Enter Your choice :");
		ans=obj.nextInt();
		if(ans==4)
			score=score+10;
		
		System.out.println("Q7.What is the range of char in java ");
		System.out.println("1) 1 byte  2) 2 bytes 3) 4 bytes 4) 8 bytes");
		System.out.println("Enter Your choice :");
		ans=obj.nextInt();
		if(ans==2)
			score=score+10;
		
		if(score>=40)
			System.out.println("Hi "+name+" ,You are pass with " +score );
		else
			System.out.println("Sorry "+name+" ,You got only " +score);
		obj.next();
		
		
	}

}
