package practice1;

public class up_super
{
	
	
	
	public static void main(String[] args)
	{
		up_super sup=new upsub();
		up_super sup1=new up_super();
		sup1.test();
		sup.test();
		
	}
	
	public void test()
    {
	System.out.println("super class method ");
	}
	
	
}
