package data_types;

public class Data_Types {
	public static void main(String[] args) { //shortcut -main control+space
		
		System.out.println("hello java");//shortcut- syso control+space

		//there are two types of data types 
		/* 1.primitive 
		 * 2.non primitive
		 */
		
		// there are 8 types of primitive data types 
		// they are language defined also known as keywords & start with lower case
		/*1.byte
		 *2.short
		 *3.integer
		 *4.long
		 *5.float
		 *6.double
		 *7.boolean
		 *8.character*/
		
		byte num=100;
		short size=10000;
		int genral=10000000;
		long large=1000000000;
		float decimal=1.12456498f;
		double longdes=123.890213;
		System.out.println("size of byte="+num);
		System.out.println("size of short="+size);
		System.out.println("size of int="+genral);
		System.out.println("size of long="+large);
		System.out.println("size of float "+decimal);
		System.out.println("size of double "+longdes);
		
		
		// 2 types of non primitive data types (user defined) also known as "Identifiers" 
		// *always start with capital letter memory size is  not fixed 
		/*1 String
		  2 Class*/
		
		String name="mukul";
		System.out.println("my name is "+name);
	}
}
