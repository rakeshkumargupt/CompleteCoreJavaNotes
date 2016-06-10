import java.util.*;

class Array6
{
public static void main(String args[])
{
	String arr[];
//to accept data from user
	Scanner obj = new Scanner(System.in);

	System.out.print("Enter how many elements? ");
	int size = Integer.parseInt(obj.nextLine());
	arr = new String[size];

	getUserInput(arr); //function call	
	printdata(arr); //function call
}
	static void getUserInput(String arr[])
	{
	Scanner obj = new Scanner(System.in);
	int x=0;
	for(String i : arr)
		{
		System.out.print("Enter Element of " + x + " position : ");

	
	arr[x]= obj.nextLine();
		x++;
		}
	}

	static void printdata(String arr[])
	{
	//to print all elements using foreach / advance for / extended for
	System.out.println();
	//for(collection_type var : collection_name)

	for(String i : arr)
	System.out.print("\t" + i);
	System.out.println("\n Total data in array: " + arr.length);	
	}
}
