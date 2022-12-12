package logical_Programs;

import java.util.Scanner;

public class UserInputScannerClass 
{
	
	
	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter 1st number");
		int a = sc.nextInt();
		System.out.println("enter 2nd number");
		int b = sc.nextInt();
		
		int c=a+b;
		
		System.out.println("sum is "+c);
		
		
	}

}
