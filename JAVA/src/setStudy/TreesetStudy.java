package setStudy;

import java.util.Iterator;
import java.util.TreeSet;

public class TreesetStudy 
{
	//properties 1.only allow linear type of data 
	
	public static void main(String[] args) 
	{
		
		TreeSet<Object> ts=new TreeSet<>();
		
		
		ts.add(10);
		ts.add(5);
		ts.add(15);
		ts.add(20);
		ts.add(25);
		
		System.out.println(ts);
		 System.out.println("**************for each****************");
  	   
  	   for(Object h:ts) 
  	   {
  		   System.out.println(h);
  	   }
  	   
  	   System.out.println("**************iterator****************");
  	   
  	   Iterator<Object> tsi = ts.iterator();
  	   
           while(tsi.hasNext()) 
           {
          	 System.out.println(tsi.next());
           }
	}

}
