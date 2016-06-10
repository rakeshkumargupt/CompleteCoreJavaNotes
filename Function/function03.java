class function03
{
	public static void main(String args[])
	{
	
	//creating object for referencing the member of the class
	function03 obj = new function03();
	obj.calculate(50,10); //actual argument
	obj.calculate(10,50); //calling /invoking the function
	
	}
	//non-static function
	void calculate(int x, int y) //formal argument
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