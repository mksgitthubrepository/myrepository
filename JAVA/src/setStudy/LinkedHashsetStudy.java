package setStudy;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashsetStudy 
{
    public static void main(String[] args) 
    
    {
    	LinkedHashSet<Object> lhs=new LinkedHashSet<>();
    	
    	lhs.add("mukul");
    	lhs.add("mukul");
    	lhs.add(null);
    	lhs.add(null);
    	lhs.add(10);
    	lhs.add(false);
    	lhs.add('m');
    	
    	System.out.println(lhs);
    	
    	System.out.println("**************for each***************");
    	
    	for(Object lhsf:lhs) 
    	{
    		System.out.println(lhsf);
    	}
    	System.out.println("**************iterator***************");
    	
    	Iterator<Object> lhsi= lhs.iterator();
    	
    	while(lhsi.hasNext())
    	{
    		System.out.println(lhsi.next());
		}
    	
    	
    	
		
	}
}
