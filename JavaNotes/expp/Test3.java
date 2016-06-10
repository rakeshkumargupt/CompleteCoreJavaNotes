class Test3
{
public static void main(String args[])
{
int a;
int b;
int c;
	try
		{
		a = Integer.parseInt(args[0]);
		b =  Integer.parseInt(args[1]);

		c = a/b;
		System.out.println(c);

		}
	catch(ArithmeticException ex)
		{
		System.out.println(ex);
		ex.printStackTrace();
		}

	catch(NumberFormatException ex)
		{
		System.out.println(ex);
		}
	catch(Exception ex)
		{
		}
	finally
	{
System.out.println("Thanks");
	}

	System.out.println("Done!");
}
}