class TestA
{
	int a=5;

	void helloFromA()
	{
	TestB obj = new TestB();
	obj.hello();
	}
	class TestB
		{
		void hello()
			{
				System.out.println("Hello from B..."); 
			}
		}
}


class TestE
{
	public static void main(String args[])
	{
		TestA obj = new TestA();
		obj.helloFromA();
	}
}



