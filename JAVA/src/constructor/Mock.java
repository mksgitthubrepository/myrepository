package constructor;
public class Mock
{
	static int a;
	int b;
	int c;
	
public Mock() {  //constructor with zero parameter
	
}
public Mock(int num) {  //constructor with one parameter
	a=num;
	
}
public Mock(int num1,int num2) {  //constructor with two parameter
	a=num1;
	b=num2;
}
public Mock(int num4,int num5,int num6) {  //constructor with three parameter
	
	a=num4;
	b=num5;
	c=num6;
}
	public static void main(String[] args) {    //main method 
		
		Mock A1=new Mock();
		A1.add();
		Mock A2=new Mock(100);
		A2.add();
		Mock A3=new Mock(10,20);
		A3.add();
		Mock A4=new Mock(10,20,30);
		A4.add();
		Mock A5=new Mock(20,30);
		A5.sub();
	}
	public void add()    //non static regular method 
	{
		int sum=a+b+c;
		System.out.println("addition is ="+sum);
	}	
	
	public void sub() {
		
		int sub=a-b-c;
		System.out.println("substraction is "+sub);
		
	}

}


