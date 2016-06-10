import java.util.*;

class array06
{
public static void main(String args[])
{
//example of two dimensional dynamic array
int rows,cols;

Scanner obj = new Scanner(System.in);
	System.out.print("Enter number of rows: ");
	rows = Integer.parseInt(obj.nextLine());
	System.out.print("Enter number of cols: ");
	cols = Integer.parseInt(obj.nextLine());

	String str[][] = new String[rows][cols];

	//to store data in twoD arrays
	for(int i=0;i<rows;i++)  //outer
	{
		for(int j=0;j<cols;j++) //inner
		{
System.out.println("Enter Data for " + i+","+j + " : " );
			str[i][j] = obj.nextLine();
		}
	}
		
		    System.out.println();
}
}