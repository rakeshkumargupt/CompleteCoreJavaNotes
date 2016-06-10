//Example of parameterised constructor
class A
{
int i;
int j;

A()
{
System.out.println("called non parameterised constructor...");
i=2;j=4;
}
A(int a,int b)
{
System.out.println("called parameterised constructor...");
i=a; j=b;
}
void print()
{
System.out.println("i = " + i);
System.out.println("j = " + j);
}

A(A temp)
{
System.out.println("called copy constructor...");
i = temp.i;
j = temp.j;
}
}
class cons6
{
public static void main(String args[])
{
	A obj = new A();
	obj.print();

	A obj2; //reference variable
	obj2 = new A();
	obj2.print();

	new A(10,20).print(); //object anonymous object
}
}