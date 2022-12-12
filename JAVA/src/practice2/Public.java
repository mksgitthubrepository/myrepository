package practice2;

public class Public 
{
	public int x=10;
	 
	public static int z=20;
	
	public  static void main(String[] args)
	{
		Public pub=new Public();
	  System.out.println("value of public global variable a="+pub.x);
	  System.out.println("value of public static variable b="+z);
	  pub.pubmethod();
	  Public.pubmethod1();
	  
	  
	}
	
	public void pubmethod()
   {
    	
	   System.out.println("public non static method ");
	  
   }
	
    public  static void pubmethod1()
   {
	   System.out.println("public static method  ");
   }
}
