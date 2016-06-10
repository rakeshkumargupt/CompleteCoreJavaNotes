class A
{
int i;
int j;

void print()
{
int k=5;
System.out.println("i = " + i);
System.out.println("j = " + j);
System.out.println("k = " + k);

}

}
class cons2
{
public static void main(String args[])
{
	A obj = new A();
	obj.print();
	
}
}