//example of loop

class loop10
{
public static void main(String args[])
{
	int arr[] = new int[5];
	arr[0] = 1111;
	arr[1] = 1112;
	arr[2] = 1113;
	arr[3] = 1114;
	arr[4] = 1115;

	for(int i : arr)
	System.out.println(i);

	for(int x=0;x<5;x++)
		System.out.println(arr[x]);

}
}