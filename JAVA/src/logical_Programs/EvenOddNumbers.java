package logical_Programs;

import java.util.Scanner;

public class EvenOddNumbers {

	public static void main(String[] args)

	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter any number");
		int number = sc.nextInt();
		
		if (number % 2 == 0) {
			System.out.println("given number is eveen number");
		} else {
			System.out.println("given number is odd number");
		}

	}

}
