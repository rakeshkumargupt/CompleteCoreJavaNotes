//passing N no. of arguments in the same function
class Test
{
static void sum(int a[])
{
int total = 0;
for(int i : a) //extedend for /foreach 	
	total+=i;

System.out.println("total : "+ total);
}

}

class Test09
{
public static void main(String args[])
{
int arr1[] = new int[2];
arr1[0] = 1;
arr1[1] = 2;

Test.sum(arr1);

int arr2[] = new int[3];
arr2[0] = 10;
arr2[1] = 20;
arr2[2] = 30;

Test.sum(arr2);

int arr3[] = new int[4];
arr3[0] = 10;
arr3[1] = 20;
arr3[2] = 30;
arr3[3] = 40;

Test.sum(arr3);

}
}