import java.util.*;

class expp
{
	public static void main(String args[])
	{
	
		Scanner obj = new Scanner(System.in);
while(true)
{
               try
             {
		System.out.print("Enter x: ");
		int x=Integer.parseInt(obj.nextLine());
		System.out.print("Enter y: ");
		int y=Integer.parseInt(obj.nextLine());
		int z=x+y;

		System.out.println("Result = " + z);
		System.out.println(x+y);
	}
}
catch(Exception ex)
{
System.out.println(ex);
}
