import java.util.*;
class array2
{
public static void main(String args[])
{
//example of single dimensional array of static type
//one step declaration

	int arr[]=new int[5];
	Scanner obj=new Scanner(System.in);
	for(int i=0;i<5;i++)
	{
		System.out.print("Enter data: ");
		arr[i] = Integer.parseInt(obj.nextLine());
	}
	//to print all elements
	for(int i : arr)
		System.out.print("\t" + i);
}
}