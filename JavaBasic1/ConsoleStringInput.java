import java.io.Console;

class ConsoleStringInput
{

public static void main(String args[])
	{

		Console obj = System.console();

		String username = obj.readLine("Enter username : ");

		System.out.println("Hello! : " + username);
	
	
	}
}
