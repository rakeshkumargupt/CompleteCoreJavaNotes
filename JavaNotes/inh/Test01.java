class A { 
int a;
int b;
}

class B extends A
{
int c;

void print()
{
	System.out.println("a = " + a + " b= " + b + " c= " + c);
}
}


class Test01
{
public static void main(String arg[])
{
B obj = new B();
obj.a = 5;
obj.b = 10;
obj.c = 15;

obj.print();
}
}