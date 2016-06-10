import java.io.Console;

class Test5
{

public static void main(String args[])
	{

		Console obj = System.console();

String password = new String(obj.readPassword("Enter Password : "));

		System.out.println("Hello! : " + password);
	}
}
