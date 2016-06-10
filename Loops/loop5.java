class loop5
{
public static void main(String args[])
{
	
	int counter=0;
	for(int i=0;i<5;i++)
	{
		if(i==3) 
		break;
		System.out.println("Outer : " + i);
		counter++;
	}

System.out.println("Total Execution : " + counter + " time(s)");
}
}
