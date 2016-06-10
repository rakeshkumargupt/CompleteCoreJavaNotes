import java.util.*;

class array05
{
public static void main(String args[])
{
//example of two dimensional dynamic array
int rows,cols;
	rows = Integer.parseInt(args[0]);
	cols = Integer.parseInt(args[1]);

	Scanner obj = new Scanner(System.in);
	String str[][] = new String[rows][cols];

	//to store data in twoD arrays
	for(int i=0;i<rows;i++)  //outer
	{
		for(int j=0;j<cols;j++) //inner
		{
System.out.println("Enter Data for " + i+","+j + " : " );
			//str[i][j] = obj.nextLine();
		}
	}
	for(int i=0;i<rows;i++)
	{
		for(int j=0;j<cols;j++)
		{
			System.out.print("\t" + str[i][j]);
			
		}
		System.out.println();
	}
}
}