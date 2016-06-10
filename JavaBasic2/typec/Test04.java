class Test04
{
public static void main(String args[])
{
int i = Integer.parseInt(args[0]); //Explicit Type Casting
	System.out.println("i = " + i);

	double d = i; //explicit type casting

	int j = (int) d; //explicit type casting using cast operator
	System.out.println(d);
}
}
