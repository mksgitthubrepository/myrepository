package protected1;

import practice2.Public;

public class Pubcall 

{

	public static void main(String[] args)
	{
		Public pu=new Public();
		
		System.out.println("public global variable calling "+pu.x);
		System.out.println("public static  variable calling "+Public.z);
		pu.pubmethod();
		Public.pubmethod1();
	}
}
