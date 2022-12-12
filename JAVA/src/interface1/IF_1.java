package interface1;

public interface IF_1 
{
public void macbook();

public void macoos();

public static void java()//here method name is same as other interface method we have 2 ways to write this method 
                         //1 make method static   2 make method default

    {
	System.out.println("mac os supprts java");
	}             

 default void price()
    {
	System.out.println("windows laptop 60000");
	}
}
