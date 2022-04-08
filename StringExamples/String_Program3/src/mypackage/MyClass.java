package mypackage;

public class MyClass 
{

	public static void main(String[] args)
	{
		String s1 = new String("Indu"); //stores at m1 memory address
		String s2 = new String("Indu"); //stores at m2 memory address
		
		if(s1==s2)
			System.out.println("Equal");
		else
			System.out.println("Not Equal"); //Output

	}

}
