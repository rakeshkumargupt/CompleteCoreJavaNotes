import java.util.*;
class array6
{
public static void main(String args[])
{
Scanner scr = new Scanner(System.in);

//two Dimensional array
int arr[][] = new int [5][5];

int count=0;
for(int i=0;i<5;i++)
{
	for(int j=0;j<5;j++)
	{
		arr[i][j] = i*j;
		count++;
	}
}

for(int i=0;i<5;i++)
{
	for(int j=0;j<5;j++)
	{
	System.out.print("\t" +arr[i][j]);
	}
	System.out.println();
}

System.out.println("count = " + count);	
	
}
}