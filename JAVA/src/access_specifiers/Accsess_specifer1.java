package access_specifiers;

public class Accsess_specifer1 
{

	
	
	public static void main(String[] args)
   {
	 Accsess_specifiers a1=new Accsess_specifiers();
	 
	 System.out.println("default  var "+a1.b);
		
	 System.out.println("protected var "+a1.c);
	 
	 System.out.println("public var "+a1.d);
		
	 System.out.println("*******************************");
	 
	 
	 a1.default1();
	 
	 a1.protected1();
	 
	 a1.public1();
		
   }
}
