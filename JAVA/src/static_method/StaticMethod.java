package static_method;

import diff_class.DiffClass;

public class StaticMethod{
	
	public static void main(String[]args) 
    {
		test();
		DiffClass.mymethod1();
		
		StaticMethod object=new StaticMethod();
		object.test2();
		
		
		DiffClass object2=new DiffClass();
		object2.mymethod2();
		
    }
	
    public static void  test() { 
	System.out.println("static method from same class");
    }

    public void test2() {
    	System.out.println("nonstatic method from same class");
    }

}




