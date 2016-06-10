import java.util.Scanner;

class Flow05
{
public static void main(String args[])
{
	int i;
	Scanner obj = new Scanner(System.in);
	System.out.print("Enter i : ");
	i = obj.nextInt(); 
	
	switch(i)
	{
		case 1:
		System.out.println("You entered One");
		break;
		case 2:
		System.out.println("You entered two");
		break;
		case 3:
		System.out.println("You entered Three");
		break;
		default:
		System.out.print("You entered a wrong number!");

	}
}
}