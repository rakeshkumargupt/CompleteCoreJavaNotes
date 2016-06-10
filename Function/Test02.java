class Test02
{
	public static void main(String args[])
	{
		calculate(5,10);
		calculate(50,10);
	}
	static void calculate(int a, int b)
	{
		int c=0;
		if(a > b)
		 c= a/b;
		else if(a <b)
		c = a+b;
		else
		c=a*b;
		System.out.println("Result: " + c);
	}
}