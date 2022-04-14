package mypackage;

public class MyClass 
{

	public static void main(String[] args) 
	{
		int[] data = new int[] {12,15,84,100,50,39};
		
		int big=data[0];
		
		for(var d:data)
		{
			if(d>big)
				big=d;
		}
		System.out.println("Big ="+big);

	}

}
