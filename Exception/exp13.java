//will compile but will not work
class testexception
{
	void sayhello() throws IllegalAccessException
	{
	throw new IllegalAccessException();
	}
}
class exp13
{
public static void main(String args[]) throws IllegalAccessException
{
testexception obj = new testexception();
obj.sayhello();
}
}