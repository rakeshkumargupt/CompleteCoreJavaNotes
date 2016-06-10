class Test02
{
public static void main(String args[])
{
	int i = Integer.parseInt(args[0]); //Explicit Type Casting
	System.out.println("i = " + i);

	String str = String.valueOf(i); //implicit type casting

	System.out.println(str);
}
}
