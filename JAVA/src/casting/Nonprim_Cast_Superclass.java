package casting;

public class Nonprim_Cast_Superclass 
{
	
	
	public static void main(String[] args) 
	{
		//up casting assigning subclass properties into superclass
		Nonprim_Cast_Superclass npc=new Nonprim_Cast_Subclass();
		Nonprim_Cast_Superclass nc=new Nonprim_Cast_Superclass();
		nc.test();
	    npc.test();
	
	
	
    }

	public void test() 
	{
		System.out.println("superclass method");
	}
	

}
