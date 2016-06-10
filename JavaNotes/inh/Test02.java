class A { 
int a;
int b;
}

class B extends A //single level inheritance
{
int c;

void print()
{
	System.out.println("a = " + a + " b= " + b + " c= " + c);
}
}

class C extends B //multi level inheritance
{

}

class D extends A //hierarchical inheritance
{

}
class Test02
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