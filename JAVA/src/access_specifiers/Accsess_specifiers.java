package access_specifiers;

public class Accsess_specifiers {
	
	//there are 4 types of access specifiers in java
	/* private     scope of private is in the particular class
	 * default    scope of default is in the packages
	 * protected  scope of protected is in packages using Inheritance
	 * public     scope of public is foe overall project  */
	
	
	
	private   int a=10;
	          int b=20;
	protected int c=30;
	public    int d=40; 
	
	
	private void private1()
	{
		System.out.println("private method");
	}	
	
	void default1() 
	{
		System.out.println("void method");
	}
	
	protected void protected1()

	{
		System.out.println("protected method ");
	}
	public void public1()
	{
		System.out.println("public method");
	}
	
	public static void main(String[] args)
	
	{
		
		Accsess_specifiers a1=new Accsess_specifiers();
		
	   System.out.println("private var call  "+a1.a);
	   
	   System.out.println("default var "+a1.b);
	   
	   System.out.println("protected var "+a1.c);
	   
	   System.out.println("public var "+a1.d);
	   
	   System.out.println("*********************************");
	   
	   a1.private1();
	   
	   a1.default1();
	   
	   a1.protected1();
	   
	   a1.public1();
	   
	   
	   
		
	}
	
	

}
