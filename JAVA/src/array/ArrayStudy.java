package array;

import java.util.Arrays;

public class ArrayStudy 
{
	  //array is 
	
	public static void main(String[] args)
	{
		
       String arrayname[]=new String[10];   //array having predefined size    
       
       String arrayName[]={" mukul" ," vijay" ," kapadnis"  };   //array changes size as per data 
     
       arrayname[0]="mukul";
       
       arrayname[1]="kapadnis";
       
       System.out.println(arrayname[0]);
       System.out.println(arrayname[1]);
       System.out.println("**************************");
       
       System.out.println(arrayName[0]);
       System.out.println(arrayname[1]);
       System.out.println("**************************");
       int i;
       
       System.out.println("array traversing using static for loop ");
       for(i=0;i<=1;i++)                           //array traversing using static for loop
       {
    	   System.out.println(arrayname[i]);
       }
       System.out.println("**************************");
       System.out.println("array traversing using dynamic for loop"); 
       for(i=0;i<=arrayName.length-1;i++)         // array traversing using dynamic for loop
       { 
    	   System.out.println(arrayName[i]);
       }
       System.out.println("**************************");
       
       
       String language[]= {" c"," c++"," java"," python"};
       
       for(i=language.length-1;i>=0;i--)
       {
    	   System.out.println(language[i]);
       }
       
       System.out.println("**************************");
       
       
       String languages[]= {" c++"," c"," python"," java"," python"};
       
       Arrays.sort(languages);
       for(i=0;i<languages.length-1;i++) 
       {
       System.out.println(languages[i]);
       }
       
       
	}

}
