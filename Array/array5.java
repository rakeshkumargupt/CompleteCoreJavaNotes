import java.util.*;
class array5
{
public static void main(String args[])
{
Scanner scr = new Scanner(System.in);

//two Dimensional array
int arr[][] = new int [5][5];

arr[0][0] = 1; //first index value for 1st row
arr[0][1] = 2; //second index value for 1st row
arr[0][4] = 5; //last index value  for 1st row

System.out.print("\t" + arr[0][0]);
System.out.print("\t" + arr[0][1]);
System.out.print("\t" + arr[0][4]);

System.out.print("\t" + arr[4][4]); //for last row,last columns

	
	
}
}