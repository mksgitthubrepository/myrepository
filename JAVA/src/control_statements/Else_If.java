package control_statements;

public class Else_If {

	public static void main(String[] args) {
		
		float IMDB=8.9f;  //IMDB - Internet movie database rating out of 10
		
		if (IMDB<=10 & IMDB>=9 )
		{
		System.out.println("movie is Blockbuster");
		}
		else if(IMDB>=8 & IMDB<9) 
		{
			System.out.println("movie is superhit");
		}
		else if (IMDB>=7 & IMDB<8) 
		{
			System.out.println("movie is hit");
		}	
		else if (IMDB>=6 & IMDB<7) 
		{
			System.out.println("movie is average");
		}
		else 
		{
			System.out.println("movie is flop");
		}
		
	}

}
