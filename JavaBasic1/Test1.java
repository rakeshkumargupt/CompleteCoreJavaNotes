import java.util.Scanner;

class Test1
{
public static void main(String args[])
	{
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter your name : ");
		String name = obj.nextLine();
		System.out.println("Welcome! " + name);
	}
}