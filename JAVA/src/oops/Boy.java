package oops;

public class Boy extends Father
{
  public void mobile()
  {
	  System.out.println("mobile");
  }
  
  public static void bike()
  {
	  System.out.println("bike");
  }
  
  public static void main(String[] args) 
  {
	Boy a1=new Boy();
	Father a2=new Father();
	Grandfather a3=new Grandfather();
	
	a1.mobile();
	a1.fathershome();
	a1.farm();
	
	a2.fathershome();
	a2.farm();
	
	a3.farm();
	
	
	
	Grandfather.home();
	
	
	Father.money();
	Father.home();
	
	Boy.bike();
	Boy.money();
	Boy.home();
  }
    
}
