package mypackage;

public class MyClass {

	int a=10;
	static int b=20;
	
	
	public static void main(String[]args) {
		MyClass a1=new MyClass();
		a1.test();
		
		
		Other a2=new Other();
		
		
		System.out.println(a1.a);
		System.out.println(b);
		
		System.out.println(a2.x);
		System.out.println(Other.z);
		
		}
	public void test()
	{
		System.out.println();
		
	}
	
}
