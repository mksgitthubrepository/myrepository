package this_super;

public class This extends Super
{

	 int a=10;
	
	public static void main(String[] args)
      { 
		
		This a1=new This();
		a1.demo();
		a1.test();
	
		
	  }
	
	
	
	public void demo()
	{
		int a=20;
		System.out.println("stat  " +a+    "  non stast  " +this.a);
		System.out.println(super.a);
	}
	
	
	
	public void test()
	{
		super.test();
		
		System.out.println("calling this class method ");// having same name as super class
    }
}


