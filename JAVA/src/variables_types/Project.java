package variables_types;

public class Project {
	
	
	String a;
	int b;
	int c;
	char d;
	String e;
	
	
	public Project(String name_of_employee,int employee_id,int age,char gender,String joining_Date) {
	
		a=name_of_employee;
		b=employee_id;
		c=age;
		d=gender;
		e=joining_Date;
		
}
	
	
	public static void main(String[] args) {
		Project a1=new Project("mukul",1234,24,'m',"04-08-2022");
		a1.info2();
		Project a2=new Project("om",12345,29,'m',"04-09-2022");
		a2.info2();	
			}
	public void info2() {
		
		System.out.println("name of employee "+a);
		System.out.println("employee id "+b);
		System.out.println("employee age "+c);
		System.out.println("employee gender "+d);
		System.out.println("employee joinung date "+e);
		System.out.println("============================");
	}

	
	
}
