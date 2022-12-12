package practice2;

public class Protected

{
	protected int a=10;
	 
	protected static int b=20;
	
	public  static void main(String[] args)
	{
	Protected pvt=new Protected();
	  System.out.println("value of protected global variable a="+pvt.a);
	  System.out.println("value of protected static variable b="+b);
	  pvt.demo4();
	  Protected.demo5();
	  
	  
	}
	
    protected void demo4()
   {
    	
	   System.out.println("protected non static method ");
	  
   }
	
   protected static void demo5()
   {
	   System.out.println("protected static method  ");
   }
	       
		
}
