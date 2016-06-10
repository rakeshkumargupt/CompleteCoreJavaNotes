class Array8
{

public static void main(String args[])
{
	String arr[][] = new String[2][2];//sting 2d array

	for(int i=0;i<2;i++)
	{
		for(int j=0;j<2;j++)
		arr[i][j] =  String.valueOf(i+j);//sum of string
	}

	for(int i=0;i<2;i++)
	{
		for(int j=0;j<2;j++)
		System.out.println(arr[i][j]);
	}


}
}
