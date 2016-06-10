class Array1
{

public static void main(String args[])
{
	int arr[] = new int[5];

	arr[0]  = 1111;
	arr[1]  = 1112;
	arr[2]  = 1113;
	arr[3]  = 1114;
	arr[4]  = 1115;

//to print all elements using simple loop

	for(int i=0;i<5;i++)
	System.out.print("\t" + arr[i]);

//to print all elements using foreach / advance for / extended for
	System.out.println();
	for(int i : arr)
	System.out.print("\t" + i);
	
}
}
