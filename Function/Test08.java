class Test
{
int a,b;

Test(int i, int j) //constructor Parametersized
{
	a=i;
	b=j;
}
void meth(Test temp)
{
temp.a = 25;
temp.b = 50;
}

}

class Test08
{
public static void main(String args[])
{
Test obj = new Test(15,20);
System.out.println("before function call:");
System.out.println(obj.a);
System.out.println(obj.b);

obj.meth(obj); //calling the meth function of Test class
System.out.println("after function call:");
System.out.println(obj.a);
System.out.println(obj.b);

}
}