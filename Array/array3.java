import java.util.*;
class array3
{
public static void main(String args[])
{
//example of single dimensional array of dynamic type
//one step declaration

	Scanner obj=new Scanner(System.in);
	System.out.print("Enter size : ");
	int size = Integer.parseInt(obj.nextLine());
	int arr[]=new int[size];
	
	for(int i=0;i<size;i++)
	{
		System.out.print("Enter data: ");
		arr[i] = Integer.parseInt(obj.nextLine());
	}
	//to print all elements
	for(int i : arr)
		System.out.print("\t" + i);
}
}