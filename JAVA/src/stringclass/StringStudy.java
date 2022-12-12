package stringclass;

public class StringStudy 

{
	
	
	/*string is non primitive data type, memory size is not fixed.                  string methods:-  
	                                                                             1.Length()          2.touppercase()
	/string used to store collection of characters.                              3.tolowercase       4. .equals()
	                                                                             5.equalsignorecas   6.contains()
	/string object gets created when we declare or  initialize string.           7.isempty()         7.charat
	                                                                             8.endswith          9.startswith
	/string is inbuilt class present inside java.lang                           10.sustring         11.concat
                                               	                                12.indexof          13.lastindexof
	/string objects are immutable (can't be changed )                           14.replace          15.split
	
	/string class is final class can't be inherited to other classes.
	
	/string object creation is done in two ways with new keyword and without new keyword */
	
	
	public static void main(String[] args) 
	{
		
		   String a="mukul kapadnis";
		   
		   String c="mukul kapadnis";
		   
		   String d="mukul";
		   
		   String e="Mukul Kapadnis";
		   
		   String f="";
		   
		   System.out.println("string length is "+a.length());
		   
		    String b=new String("usage "+a);
		    
		    System.out.println(b);
		    
		    System.out.println("string into uppercase "+a.toUpperCase());
		   
	        System.out.println("string into lower case "+a.toLowerCase());
	        
	        System.out.println("check sequence of characters of a & c "+a.equals(c));
	        
	        System.out.println("check sequence of characters of c & d "+a.equals(d));
	        
	        System.out.println("ignore  sequence of characters of e & e "+a.equalsIgnoreCase(e));
	        
	        System.out.println(a.contentEquals(c));
	        
	        System.out.println("string contains "+a.contains("mukul"));
	        
	        System.out.println("string is empty or not "+f.isEmpty());  //if there is only space then also not showing empty 
	        
	        System.out.println("char at 6 is "+a.charAt(6));
	        
	        System.out.println("string ends with nis "+a.endsWith("nis"));
	        
	        System.out.println("staris with d "+a.startsWith(d));
	        
	        System.out.println("string substring "+a.substring(1));     // in substring it will count length from 1
	        
	        System.out.println("concat "+a.concat(" "+d));
	        
	        System.out.println("index of m first occurence "+a.indexOf("m"));
	        
	        System.out.println("index of u starts with"+a.indexOf("u"));
	        
            System.out.println();	        
	        
	        
		
		
		
	}

}
