//program with exception handling with multiple catch block
import java.util.*;
class exp4
{

	public static void main(String args[])
	{
	int a=0;
	int b=0;
	int c=0;
	
	Scanner obj = new Scanner(System.in);
	while(true)
	{
	try
		{	
		System.out.print("Enter a : ");
		a = Integer.parseInt(obj.nextLine());
		System.out.print("Enter b : ");
		b = Integer.parseInt(obj.nextLine());
		c = a/b;
		System.out.println("Result of a/b=" + c);
		}
	catch(ArithmeticException ex)
		{
		System.out.println(ex);
System.out.println("do not divide by zero!");
		}
	catch(NumberFormatException ex)
		{
		System.out.println(ex);
System.out.println("please enter only digits!");
		}
catch(Exception ex)
	{
	System.out.println(ex);
	}
	}
	}
}