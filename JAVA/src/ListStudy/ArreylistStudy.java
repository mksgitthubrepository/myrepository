package ListStudy;

import java.util.ArrayList;

public class ArreylistStudy 
{
    public static void main(String[] args) 
    {
       
    ArrayList<Object> mk= new ArrayList<>();
    
    mk.add("mukul");
    mk.add(10);
    mk.add(1998);
    mk.add("mukul");
    mk.add('m');
    mk.add(true);
    mk.add(10.5f);
    
    System.out.println(mk);
    mk.add(2, "mk");
    System.out.println(mk);
    System.out.println( mk.size());
    mk.set(3, 2022);
    System.out.println(mk);
    Object m = mk.clone();
     
    System.out.println(m.equals(mk));
    
   // mk.clear();
    //System.out.println(mk);
    
    
    System.out.println(mk.get(1));
    System.out.println(mk.indexOf("mk"));
    System.out.println(mk.contains("mk"));
    
    System.out.println("***************for loop***************");
    
    for(int i=0;i<=mk.size()-1;i++) 
    {
    	System.out.println(mk.get(i));
    }
    System.out.println("***************for each loop***************");
  for(Object a:mk) 
  {
	  System.out.println(a);
  }
     
     
   
    
    }
}
