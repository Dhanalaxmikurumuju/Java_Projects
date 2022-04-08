package mypackage;

public class MyClass 
{
   
	public static void main(String[] args) 
	{

     String s1="Indu"; 
     //stores at string pool and points to m1 memory location
     String s2="Indu"; 
     //stores at string pool and points to m1 memory location
     
     if(s1==s2)
    	 System.out.println("equal"); //Output
     else
    	 System.out.println("Not Equal");
     
    }

}
