class A
{
int i,j;  //data member

void setData(int i, int j)
	{
		this.i=i;
		this.j=j;	
	}
void print()
{
	System.out.println(i);
	System.out.println(j);

}
}

class test2
{
public static void main(String args[])
{
A obj = new A();
obj.setData(10,20);

obj.print();

}
}