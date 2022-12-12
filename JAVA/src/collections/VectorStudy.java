package collections;

import java.util.Iterator;
import java.util.Vector;

public class VectorStudy 
{
	
	
	public static void main(String[] args)
	{
		
		Vector<Object> v=new Vector<Object>();
		
		
		v.add("collections");
		v.add("arraylist");
		v.add("vector");
		v.add(100);
		v.add(null);
		v.add(" ");
		v.add("linkedlist");
		v.add(null);
		
		System.out.println(v);
		System.out.println(v.capacity());
		System.out.println(v.equals(v.clone()));
		System.out.println(v.contains(1000));
		System.out.println(v.elementAt(3));
		System.out.println(v.firstElement());
		System.out.println(v.get(6));
		System.out.println(v.hashCode());
		System.out.println(v.indexOf(" "));
		System.out.println(v.isEmpty());
		System.out.println(v.lastElement());
		System.out.println(v.remove(null));

		
		System.out.println("*******************************************");
		for(int i=0;i<=v.size()-1;i++) 
	        {
	      	  System.out.println(v.get(i));
	        }
		System.out.println("*******************************************");
		
		
		Iterator<Object> arraylist = v.iterator();
			
	      while(arraylist.hasNext()) 
	      {
	       	System.out.println(arraylist.next());
	      	
	      }
	      
	      System.out.println("*******************************************");
	       
	     for(Object arraylist1:v) 
	       {
	              	
	         System.out.println(arraylist1);
	       } 
	        
	       

		
		
	}

}
