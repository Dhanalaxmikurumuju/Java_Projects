package mypackage;

public class MyClass 
{

	public static void main(String[] args) 
	{
		String s1 = "Indu";  //stores at string pool
		String s2 = new String("Indu");
		//points to a new memory location which is different from s1 address
		 
		if(s1==s2)
			System.out.println("Equal");
		else
			System.out.println("Not Equal"); //Output

	}

}
