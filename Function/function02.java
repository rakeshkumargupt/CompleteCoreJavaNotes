class function02
{
	public static void main(String args[])
	{
	calculate(50,10); //actual argument
	calculate(10,50);
	}
	static void calculate(int x, int y, int z) //formal argument
	{
	int result=0;
		if(x > y)
		 result = x/y;
		else if(x < y)
		  result = x+y;
		else
		  result = x*y;
		System.out.println("Result=" +result);	
}
}