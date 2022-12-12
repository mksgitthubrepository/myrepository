package variables_types;

public class Localglobalvariable {
	
int a=10;          //global variable 
static int b=20;  //static variable 

public static void main(String[] args) {
	
	
	Localglobalvariable a1=new Localglobalvariable();
	a1.test();
	
	System.out.println("calling non static global variable ="+a1.a);
	
	int sum=30+a1.a;
	 System.out.println("use non static global variable= "+sum);
	 
	 System.out.println("calling static globalvariable= "+b);
	
	 int sub=50-b;
	 System.out.println("use of static global variable= "+sub);
	 
	 //==============================================================
	
	//from another method
	 Demo a2=new Demo();
	 
	 System.out.println("call global non static variable from another class="+a2.a);

int mul=20*a2.a;
System.out.println("use of global non static variable from another class= "+mul);

System.out.println("calling static globalvariable from another class="+Demo.d);

int div=300/Demo.d;
System.out.println("use static globalvariable from another class="+div);

}

public void test()
{
	
System.out.println("non static method ");
}

}