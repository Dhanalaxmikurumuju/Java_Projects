package com.company.lockers;

import java.io.File;
import java.io.FileWriter;
import java.util.LinkedList;
import java.util.Scanner;

public class LockedMe 
{
    static final String projectPath="E:\\3.INDU\\javaProjects\\CompanyLockersProject\\LockedMeProjectfiles";
	
	public static void main(String[] args)
	{
		Scanner obj = new Scanner(System.in);
		int ch;
		do
		{
		    displayMenu();
		    System.out.println("Enter your choice :");
		    ch=Integer.parseInt(obj.nextLine());
		
		    switch(ch)
		      {
		          case 1 : getAllFiles();
		               break;
		          case 2 : createFiles();
		               break;
		          case 3 : deleteFiles();
                       break;
		          case 4 : searchFiles();
                       break;
		          case 5 : System.exit(0);        //command Line exit
                       break;
                  default:System.out.println("Invalid Option");
		      }
		 }   
		while(ch>0);
		
	}
	
	public static void displayMenu()
	{
		System.out.println("*************************************************************");
		System.out.println("\t Welcome to Company Lockers - LockedMe.com ");
		System.out.println("\t Developer Name : Kurumuju Dhanalaxmi");
		System.out.println("*************************************************************");
		System.out.println("\t 1. Display all the files");
		System.out.println("\t 2. Add files to existing directory");
		System.out.println("\t 3. Delete a file");
		System.out.println("\t 4. Search a file");
		System.out.println("\t 5. Exit");
		System.out.println("*************************************************************");
		
		
	}

	public static void getAllFiles()
	{
		File[] listOfFiles = new File(projectPath).listFiles();
		
		//if the folder is empty
		if (listOfFiles.length==0)
			System.out.println("No file existing in the directory");
		else
		{
			for(File l:listOfFiles)
			{
				System.out.println(l.getName());
			}
		}
		
	}
	
	public static void createFiles()
	{
		try 
		{
		       String fileName;
		       int linesCount;
		       Scanner obj = new Scanner(System.in);
		
		       System.out.println("Enter file name : ");
		       fileName=obj.nextLine();
		
		       System.out.println("How many  linesyou want to add in the file :");
		       linesCount=Integer.parseInt(obj.nextLine());
		
		       FileWriter fw = new FileWriter(projectPath+"\\"+ fileName);
		       
		       for(int i=1;i<=linesCount;i++)
		          {
		    	      System.out.println("Enter file content line : ");
		    	      fw.write(obj.nextLine()+"\n");
		          }
		       
		       System.out.println("File Created Successfully");
		       fw.close();
		  }
		
		catch(Exception e)
		{
			System.out.println("Some Error Occoured.");
		}
		
    }
	
	public static void deleteFiles()
	{
		Scanner obj = new Scanner(System.in);
		try
		{
			String fileName;
			System.out.println("Enter the file name to be deleted");
			fileName=obj.nextLine();
			
			File fl = new File(projectPath+"\\"+ fileName);
			
			if(fl.exists())
			{
				fl.delete();
				System.out.println("File Deleted Successfully");
			}
			else
			{
				System.out.println("FIle do not exist");
			}
		}
		catch(Exception e)
		{
			System.out.println("Some error occorued");
		}
    }
	
	public static void searchFiles()
	{
		Scanner obj = new Scanner(System.in);
		
		try
		{
			String fileName;
			System.out.println("Enter the file name to be searched:");
			fileName=obj.nextLine();
			
			File fl = new File(projectPath+"\\"+ fileName);
			
			if(fl.exists())
			{
			    System.out.println("File is Available");
			}
			else
			{
				System.out.println("FIle is not Available");
			}
		}
		catch(Exception e)
		{
			System.out.println("Some Error Occorued");
		}
			
		
	}
}

