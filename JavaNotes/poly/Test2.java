class A
{
void hello()
{
System.out.println("Hi from parent!");
}
}

class B extends A
{
void hello(String str)
{
System.out.println("Hi from child!" +str);
}
}

class Test2
{
public static void main(String args[])
{
	B obj = new B();
	obj.hello("admin!");
}
}