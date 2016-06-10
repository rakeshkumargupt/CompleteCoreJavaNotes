import java.util.*;

class array07
{
public static void main(String args[])
{
//example of two dimensional dynamic array
int rows,cols;

Scanner obj = new Scanner(System.in);
	System.out.print("Enter number of rows: ");
	rows = obj.nextInt();
	System.out.flush();
	System.out.print("Enter number of cols: ");
	cols = obj.nextInt();
	System.out.flush();

	String str[][] = new String[rows][cols];

	//to store data in twoD arrays
	for(int i=0;i<rows;i++)  //outer
	{
		for(int j=0;j<cols;j++) //inner
		{
System.out.println("Enter Data for " + i+","+j + " : " );
System.out.flush();
			str[i][j] = obj.nextLine();
		}
	}

	for(int i=0;i<rows;i++)  //outer
	{
		for(int j=0;j<cols;j++) //inner
		{
System.out.println("\t" + str[i][j]);
			
		}
		System.out.println();
	}
		

		

		    System.out.println();
}
}