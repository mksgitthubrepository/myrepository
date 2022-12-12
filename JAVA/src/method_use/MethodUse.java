package method_use;

public class MethodUse {
	
	// complete method -method having declaration as well as definition
	
	public static void main(String[]args) //-->> declaration 
	{
	     // body-->>definition
	}
	
	// incomplete method -method having declaration only (without body)
	// public static void task();
	
	public static void task() 
	{
	// how to call static method from same class
	//methodName();
	m();//calling static regular method from same class
	}
	//regular static method(complete)
	public static void m()
	{
	System.out.println("HI I am static method"); 
	{
		 
	 }
	}
}

