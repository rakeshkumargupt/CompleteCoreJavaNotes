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
class cons8
{
public static void main(String args[])
{
	A obj = new A();
	obj.print();

	A obj2 = new A(10,20);
	obj.i = obj2.i; //copy copying
	obj.j = obj2.j; //deep copy
	obj2.print();
	
	obj2.i=25; obj2.j=50;

	System.out.println(obj.i);  //2
	System.out.println(obj.j);  //4
	System.out.println(obj2.i); //25
	System.out.println(obj2.j); //50



}
}