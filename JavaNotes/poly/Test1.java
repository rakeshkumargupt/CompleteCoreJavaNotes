class A
{
void hello()
{
System.out.println("Hi from parent!");
}
}

class B extends A
{
void hello()
{
System.out.println("Hi from child!");
}
}

class Test1
{
public static void main(String args[])
{
	A obj = new A();
	obj.hello();
}
}