package control_statements;

public class Nested_If 
{
	public static void main(String[] args)
	{
		String username ="mukulkapadnis";
		String password ="mukul@123";
		
		if (username =="mukulkapadnis")
		{
			System.out.println("enter ur password");
			if (password =="mukul@123")
			{
				System.out.println("welcome");
			}
			else 
			{
				System.out.println("check ur password unable to login ");
			}
		}	
		else 
		{
			System.out.println("check ur username ");
		}
	}
	
}

	


