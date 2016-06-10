class Test03
{
	public static void main(String args[])
	{
	Test03 obj = new Test03();
		obj.calculate(5,10);
		obj.calculate(50,10);
	}
	void calculate(int a, int b)
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