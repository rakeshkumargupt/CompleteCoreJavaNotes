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


class TestC
{
	public static void main(String args[])
	{
		TestA obj = new TestA();
		System.out.println("a = " + obj.a);
	}
}



