class A
{
int i=5;
int j=10;
}

class B  extends A
{
int i=50;
int j=100;

void print()
{
	System.out.println(super.i);
	System.out.println(super.j);
}
}

class test
{
public static void main(String args[])
{
B obj = new B();
obj.print();

}
}