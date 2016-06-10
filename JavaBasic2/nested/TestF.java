class TestA
{
	int a=5;

	void hi()
	{
	System.out.println("hi from A...");
	}

	void helloFromA() //to access inner class member
	{
	TestB obj = new TestB();
	obj.hello();
	}


	public class TestB
		{
		void hello()
			{
				hi();
				System.out.println("Hello from B..."); 
			}
		}
}


class TestF
{
	public static void main(String args[])
	{
		TestA obj = new TestA();
		obj.helloFromA();

TestA obj2 = new TestA();
	TestA.B obj3 = new TestA.B();

	}
}



