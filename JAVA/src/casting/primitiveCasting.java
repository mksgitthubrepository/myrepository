package casting;

public class primitiveCasting 
{
     public static void main(String[] args) 
    {
    	 
    	// implicit  casting convert lower type of data type  into higher(widening casting )
    	 
	byte a=10;
	
	short b=a;
	int c=a;
	long d=a;
	float e=a;
	double f=a;
	System.out.println("byte to short "+b);
	System.out.println("byte to int "+c);
	System.out.println("byte to long "+d);
	System.out.println("byte to float "+e);
	System.out.println("byte to double "+f);
	
	
	System.out.println("******************");
	
	      // explicit casting convert higher data type into lower data type (narrowing casting)
	
	
	double g=1234;
	
	float h=(float) g;
	long i=(long) g;
	int j=(int) g;
	short k=(short) g;
	byte l=(byte) g;
	
	System.out.println("double to float "+h);
	System.out.println("double to long "+i);
	System.out.println("double to int "+j);
	System.out.println("double to short "+k);
	System.out.println("double to byte "+l);
    }
}
