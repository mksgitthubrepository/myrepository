package polymorphisom;

public class Compiletime_Overload
{
	public static void main(String[] args) 
	{
		Compiletime_Overload a1=new Compiletime_Overload();
		a1.test();
		a1.test("happy morning");
		a1.test(12,"hungry");
		a1.test(4.15f, "tea time");
		a1.test(10.15, "Tired");
		
	}
	
	   public void test()
	   {
		   System.out.println("behavior");
	   }
	   
       public  void test(String morning)
       {
    	   System.out.println(morning);
       }
       
       public void test( int a,String afternoon )
       {
    	  System.out.println(a+"pm  "+afternoon);
    	 
       }
       public void test(float time,String a)
       {
    	   System.out.println(time+"pm  "+a);
    	   
       }
       public void test(double b,String c)
       {
    	System.out.println(b+"pm "+c);   
       }

}
