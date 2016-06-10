class A
{
int a;int b;
}

class B 
{
void print()
{
	A obj = new A(); //containment
	obj.a = 5;
	obj.b = 10;
}
}
class C extends B
{

}


class Test03
{
public static void main(String args[])
{
	B obj = new B();
	C obj2 = new C();
	obj2.a = 10;
	obj2.b = 20;
}
}