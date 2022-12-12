package polymorphisom;

public class Runtime_override1 extends Rutime_override
{
	public void test()

	{
		System.out.println("sad");
	}
	
	public static void main(String[] args) 
	{
		Runtime_override1 a1=new Runtime_override1();
		Rutime_override a2=new Rutime_override();
		a2.test();
		a1.test();
	}

}
