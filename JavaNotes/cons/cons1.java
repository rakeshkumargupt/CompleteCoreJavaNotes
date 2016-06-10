class A
{
int i;
int j;

void print()
{
System.out.println("i = " + i);
System.out.println("j = " + j);
}

}
class cons1
{
public static void main(String args[])
{
	A obj = new A();
	obj.print();
	
}
}