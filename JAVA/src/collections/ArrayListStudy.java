package collections;

import java.util.ArrayList;
import java.util.Iterator;


public class ArrayListStudy 
{

	
	public static void main(String[] args) 
	{
		
		ArrayList<Object> a= new ArrayList<Object>(); 
	
		
		
		a.add(10);
		a.add("java");
		a.add(10.5);
		a.add("selenium");
		a.add("testng");
		a.add("java");
		a.add(null);
		a.add(2, null);
		
		
		
		System.out.println(a);
		System.out.println(a.size());
		System.out.println(a.contains("java"));
		
		System.out.println(a.containsAll(a));
		System.out.println(a.clone());
		System.out.println(a.equals(a.clone()));
		System.out.println(a.get(5));
        System.out.println(a.hashCode());
        System.out.println(a.indexOf("testng"));
        System.out.println(a.isEmpty());
        System.out.println(a.remove(10.5));
        System.out.println(a.set(6, "maven"));
        System.out.println(a.getClass());
        
        System.out.println("*******************************************");
      Iterator<Object> arraylist = a.iterator();
		
while(arraylist.hasNext()) 
{
	System.out.print(arraylist.next()+" ");
	
}
System.out.println("*******************************************");
  for(Object arraylist1:a) 
        {
        	
        	System.out.println(arraylist1);
        } 
  System.out.println("*******************************************");
  for(int i=0;i<=a.size()-1;i++) 
  {
	  System.out.println(a.get(i));
  }


		
		
	}
	
}
