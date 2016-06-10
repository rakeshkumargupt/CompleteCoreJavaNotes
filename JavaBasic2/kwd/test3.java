class A 
{
int a;
}

class B
{
int b;
}


class test3
{
public static void main(String args[])
{
	A obj1 = new A();
	A obj2 = new A();
	B obj3 = new B();
 
	if(A instanceof obj1)
	  System.out.println("matched");
	else
	  System.out.println("not matched");
 
}
}