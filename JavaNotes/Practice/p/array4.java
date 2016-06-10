import java.util.*;

class Array3
{

public static void main(String args[])
{
	String arr[] = new String[5];
//to accept data from user

	Scanner obj = new Scanner(System.in);
	int x=0;
	for(String i : arr)
	{
		System.out.print("Enter Element of " + x + " position : ");
		arr[x]= obj.nextLine();
		x++;
	}
//to print all elements using foreach / advance for / extended for
	System.out.println();
	//for(collection_type var : collection_name)

	for(String i : arr)
	System.out.print("\t" + i);
	System.out.println("\n Total data in array: " + arr.length);	
}
}
