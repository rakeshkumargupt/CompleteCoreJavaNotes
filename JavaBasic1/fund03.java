class fund03
{
//example of implicit type casting 
public static void main(String args[])
{
	int x=65;
	System.out.println("x = " + x);
	char c = (char)x;
	System.out.println("c = " + c);
	x++;
	c = (char)x;
	System.out.println("c = " + c);
	x++;
	c = (char)x;
	System.out.println("c = " + c);
	x++;
	c = (char)x;
	//implicit type casting by complier
	int y = c; //'D'
	System.out.println("y = " + y);

}
}

