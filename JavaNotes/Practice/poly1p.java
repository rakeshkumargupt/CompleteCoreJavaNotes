class A 
{
	void calculate(int v, int r)
	{
		System.out.println(v^2/r);
	}
	void calculate(int m, int v,int r)
	{
		System.out.println(m*v^2/r);
	}

}


class poly1p
{
	public static void main(String arg[])
		{
			A obj = new A();
			obj.calculate(2,6);
obj.calculate(2,3,4);

		}
}