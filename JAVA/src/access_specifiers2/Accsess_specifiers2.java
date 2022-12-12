package access_specifiers2;

import access_specifiers.Accsess_specifiers;

public class Accsess_specifiers2 extends Accsess_specifiers
{

	
	public static void main(String[] args)
	{
	  Accsess_specifiers a1=new Accsess_specifiers();
	  
	  
	  Accsess_specifiers2 a2=new Accsess_specifiers2();
	  
	  
	  System.out.println("public  var "+a1.d);
	  
	  System.out.println("protected var "+a2.c);
	  
	  System.out.println("********************************");
	  
	  a1.public1();
	  
	  a2.protected1();
	}
}
