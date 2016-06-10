class MyCalculate
{
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

class Test04
{
	public static void main(String args[])
	{
		MyCalculate.calculate(5,10);
		MyCalculate.calculate(50,10);
	}
	
}