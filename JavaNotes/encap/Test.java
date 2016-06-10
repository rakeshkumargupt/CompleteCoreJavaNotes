class A
{
int a;
int b;
}

class B extends A
{
int c;
}


class Test {

public static void main(String args[])
{
	B obj = new B();

	obj.c=5;
	obj.a = 10;
	obj.b = 20;

}
}