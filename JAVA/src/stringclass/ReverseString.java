package stringclass;

public class ReverseString 
{
	

	public static void main(String[] args)
	{

	String a="454";
    String b="";
	for(int i=a.length()-1;i>=0;i--)
	{
		b=b+a.charAt(i);
	}
	System.out.println(b);
	
	if(b.equals(a)) 
	{
		System.out.println("palindrome number");
	}
	else
	{
		System.out.println("not a palinrome");
	}

	}
}
