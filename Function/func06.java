// Objects are passed by reference.
	class Test //user defined type
{ //begining of class

		int a, b;

		Test(int i, int j) //constructor
		{
			a = i;
			b = j;
		}
		// pass an object
		void meth(Test obj) 
		{
			obj.a = 25;
			obj.b = 50;
		}

} //end of class

class func06 
{
public static void main(String args[]) 
{
Test obj = new Test(15, 20);
System.out.println("obj.a and obj.b before call: " +
obj.a + " " + obj.b);
obj.meth(obj);
System.out.println("obj.a and obj.b after call: " +
obj.a + " " + obj.b);
}
}