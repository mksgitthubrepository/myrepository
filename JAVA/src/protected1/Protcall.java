package protected1;

import practice2.Protected;

public class Protcall extends Protected
{
public static void main(String[] args) 

{
	
	Protcall pc=new Protcall();
	System.out.println("protected global variable calling "+pc.a);
	System.out.println("protected static  variable calling "+b);
    pc.demo4();
    Protcall.demo5();
	
    
    
}
}
