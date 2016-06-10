//Example of non parameterised constructor
class A
{
int i;
int j;

A()
{
System.out.println("called non parameterised constructor...");
i=2;j=4;
}

void print()
{
int k=5;
System.out.println("i = " + i);
System.out.println("j = " + j);
System.out.println("k = " + k);

}

}
class cons3
{
public static void main(String args[])
{
	A obj = new A();
	obj.print();

	A obj2 = new A();
	obj2.print();
	
}
}