class TestA
{
	int a=5;

	class TestB
		{
		void hello()
			{
				System.out.println("Hello from B..."); 
			}
		}
}


class TestD
{
	public static void main(String args[])
	{
		TestA$TestB obj = new TestA$TestB();
		obj.hello();
	}
}



