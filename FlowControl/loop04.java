//example of loop

class loop04
{
public static void main(String args[])
{
	//for loop (decrement)
int counter=0;
	for(int i=0;i<5;i++) //outer
		{
		for(int j=0;j<5;j++) //inner
			{

			
	if(j==2)
		break;
System.out.println("Welcome!");
counter++;
			}
		}

System.out.println("Total execution: " + counter);

}
}