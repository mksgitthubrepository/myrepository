package collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListStudy
{
	
	
	public static void main(String[] args) 
	{
		LinkedList<Object> l=new LinkedList<Object>();
		
		
		l.add("list");
		l.add(12.5);
		l.add("b");
		l.add("linkedlist");
		l.add(null);
		l.add(10);
		l.add(null);
		l.addFirst("addatfirst");
		l.addLast("addatlast");
		
		
	     System.out.println(l);
	     System.out.println(l.contains(12));
	     System.out.println(l.get(3));
	     System.out.println(l.getFirst());
	     System.out.println(l.getLast());
	     System.out.println(l.indexOf(null));
	     System.out.println(l.isEmpty());
	     System.out.println(l.peekFirst());
	     System.out.println(l.size());
	    
	      System.out.println("***********************************************");
	 
          Iterator<Object> linkedlist = l.iterator();
          while(linkedlist.hasNext())
          
          {
        	  System.out.println(linkedlist.next());
          }		
		
          System.out.println("***********************************************");
        
      for (int i=0;i<=l.size()-1;i++) 
      {
    	  System.out.println(l.get(i));
    	 
      }
      
          System.out.println("***********************************************");
          
          for(Object llist:l) 
          {
        	  System.out.println(llist);
          }
	}

}
