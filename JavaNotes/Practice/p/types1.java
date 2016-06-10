class type1
{
public static void main(String args[])
{
	int x=65;

	char c=(char)x; //explicit type casting

	System.out.println(x);
	System.out.println(c);

	int y=c; //implicit type casting
	System.out.println(y);


}
}