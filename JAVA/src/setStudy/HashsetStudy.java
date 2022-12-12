package setStudy;

import java.util.HashSet;
import java.util.Iterator;

public class HashsetStudy 
{
	
//properties 1.duplicates not allowed 2.allow only 1 null value 3.order of insertion is random 
//4.no default capacity 5.storage type is Hashtable 6.not supports index methods 7.not supports for loop.	
	
	
       public static void main(String[] args) 
    {
		
    	   HashSet<Object> hs=new HashSet<>();
    	   
    	   hs.add("mukul");
    	   System.out.println(hs.add("mukul"));
    	   System.out.println(hs.add(null));
    	   hs.add(null);
    	   hs.add("om");
    	   hs.add(10);
    	   hs.add(true);
    	   
    	   System.out.println(hs);
    	   
    	   System.out.println("**************for each****************");
    	   
    	   for(Object h:hs) 
    	   {
    		   System.out.println(h);
    	   }
    	   
    	   System.out.println("**************iterator****************");
    	   
    	   Iterator<Object> hsi = hs.iterator();
    	   
             while(hsi.hasNext()) 
             {
            	 System.out.println(hsi.next());
             }
    	   
    }
}
