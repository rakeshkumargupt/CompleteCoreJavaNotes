//will compile and will not work
class testexception
{
	void sayhello() throws IllegalAccessException
	{
	throw new IllegalAccessException();
	}
}
class exp14
{
public static void main(String args[]) 
{
testexception obj = new testexception();
try
{
obj.sayhello();
}
catch(Exception ex)
{
}
System.out.println("ok");
}
}