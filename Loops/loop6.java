class loop6
{
public static void main(String args[])
{
	
	int counter=0;
	for(int i=0;i<5;i++)
	{
	for(int j=0;i<5;j++)
	{
		if(j==3) 
		break;
		System.out.println("Outer : " + i);
		counter++;
	}
	}

System.out.println("Total Execution : " + counter + " time(s)");
}
}
