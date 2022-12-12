package stringclass;

public class StringMethods  
{
   public static void main(String[] args) 
   {
	String a="mukul";
	
	String A="Mukul";
	
	String B="";
	
	System.out.println(a.length());
	
	int b=a.length();
	
	System.out.println("string lenght= "+b);
	
	System.out.println(a.toUpperCase());
	
	String U=a.toUpperCase();
	
	System.out.println("uppercase "+U);
	
	System.out.println(a.toLowerCase());
	
	String L=a.toLowerCase();
	
	System.out.println("lowercase= "+L);
	
	System.out.println(a.equals(A));
	
	System.out.println(a.equalsIgnoreCase(A));
	
	System.out.println(a==A);
	
	System.out.println("contains "+a.contains("mu"));
	
	System.out.println("contains "+B.contains(" "));
	
	System.out.println("empty "+B.isEmpty());
	
	System.out.println("empty "+a.isEmpty());
	
	System.out.println("char at "+a.charAt(3));
	
	System.out.println("starts with "+a.startsWith("muk"));
	
	System.out.println("ends with "+a.endsWith("ul"));
	
	System.out.println("sub "+a.substring(2));
	
	System.out.println("concat "+a.concat(A));
	
	System.out.println("index "+a.indexOf("u"));
	
	System.out.println("last index "+a.lastIndexOf("u"));
	
	System.out.println("replace "+a.replace("kul","cool") );
	
	System.out.println("replace "+a.replaceFirst("u", "oo"));
	
	}
}
