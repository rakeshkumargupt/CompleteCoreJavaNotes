//will not compile 
class testexception
{
	void sayhello()
	{
	throw new java.lang.IllegalAccessException();
	}
}
class exp12
{
public static void main(String args[])
{
testexception obj = new testexception();
obj.sayhello();
}
}