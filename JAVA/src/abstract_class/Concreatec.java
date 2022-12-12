package abstract_class;

public class Concreatec extends Abstract
{
	public static void main(String[] args)
	{
		Concreatec a1=new Concreatec();
		
		
		
		
		
		a1.abstractc();
		a1.con();
		
	}
	public void abstractc() 
	{
		System.out.println("abstract method from abs class");
		
	}
	
	public void con()
	{
		System.out.println("method from concreat class");
	}
	

	

	

}
