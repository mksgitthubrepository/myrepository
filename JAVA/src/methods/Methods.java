package methods;
public class Methods{
	
	public static void main(String[]args)   //main method complete (static)
	{
		System.out.println("static complete main method ");
		
	test();
	
	Methods a1=new Methods();
	a1.main();
	
    }
	//public static void main()-->> main method incomplete 
	
	public static void test()//regular method as there is no "main" near to parenthesis 
   
	//we have to call it
	{
		System.out.println("regular complete method ");
	}
	
	
		//public static void test1();//-->>regular method incomplete

	public void main() {
		System.out.println("non static method");
	}
}