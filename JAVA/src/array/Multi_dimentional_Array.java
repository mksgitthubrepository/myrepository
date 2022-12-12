package array;

public class Multi_dimentional_Array 
{
    //   00  01   02
	//   11  12   13
	//   20  21   22
	
	
	
	public static void main(String[] args) 
     {
		
		

		
		int array[][]=new int[3][3];                     
		 
		array[0][0]=10;                                  
		array[0][1]=20;                                 
		array[1][0]=30;
		array[1][1]=40;
		
		
		System.out.print(array[0][0]+" ");
		System.out.println(array[0][1]);
		System.out.print(array[1][0]+" ");
		System.out.println(array[1][1]);
		
		//3*3 matrix of string 
		
		String team[][]=new String[3][3];
		
		
		team[0][0]="mukul";
		team[0][1]="om";
		team[0][2]="atharva";
		team[1][0]="nitin";
		team[1][1]="sanyog";
		team[1][2]="shubham";
		team[2][0]="tejas";
		team[2][1]="nilesh";
		team[2][2]="ajay";
		
		
		for(int i=0;i<=2;i++) //-->> outer for loop for rows 
		{
			for(int j=0;j<=2;j++)  //-->> inner for loop for columns 
			{
			System.out.print(team[i][j]+" ");
			}
			System.out.println();    //-->> for print column on next line s 
		}
		
		/*System.out.print(team[0][0]+" ");
		System.out.print(team[0][1]+" ");
		System.out.println(team[0][2]);
		System.out.print(team[1][0]+" ");
		System.out.print(team[1][1]+" ");
		System.out.println(team[1][2]);
		System.out.print(team[2][0]+" ");
		System.out.print(team[2][1]+" ");
		System.out.println(team[2][2]);*/
		
		
		System.out.println("********************");
		
		String names[][]= {{"rohit","shikhar","surya"},{"virat","hardik","DK"},{"jasprit","shami","bhuvi"}};
		
		for(int i=0;i<=names.length-1;i++)
		{
			for(int j=0;j<=names.length-1;j++)
			{
				System.out.print(names[i][j]+" ");
			}
			System.out.println();
	    }
		
		
	 }
}
