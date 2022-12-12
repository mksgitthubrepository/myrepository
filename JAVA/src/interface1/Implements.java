package interface1;

public class Implements implements IF_1,IF_2
{
	
	public static void main(String[] args) 
	{
		Implements ic=new Implements();
		ic.lenovo();
		ic.windows();
		ic.macbook();
		ic.macoos();
		IF_1.java();
		IF_2.java();
		ic.price();
	}

	@Override
	public void lenovo()
	{
		System.out.println("lenovo legion");
	}

	@Override
	public void windows() 
	{
		System.out.println("windows operating system");
	}

	@Override
	public void macbook()
	{
		System.out.println("macbook pro");
	}

	@Override
	public void macoos() 
	{
		System.out.println("macos operating system");
	}

	@Override
	public void price() 
	{
		IF_1.super.price();
		IF_2.super.price();
	}

	

}
