class MyCalculate
{
private void calculate(int a, int b)
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
class Test05
{
	public static void main(String args[])
	{
	MyCalculate obj = new MyCalculate();
		obj.calculate(5,10);
		obj.calculate(50,10);
	}
}