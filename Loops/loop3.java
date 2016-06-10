class loop3
{
public static void main(String args[])
{
	int counter=0;
	for(int i=0;i<5;i++)
	{
		System.out.println("Outer : " + i);
		for(int j=0;j<5;j++)
		{
		System.out.println("\tInner " + j);
		counter++;
		}
	}
System.out.println("Total Execution : " + counter + " time(s)");
}
}
