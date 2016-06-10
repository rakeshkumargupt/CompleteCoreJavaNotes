abstract class p1
{
	abstract void display(); 
	void hello()
	{
		System.out.println("CH3COOH");
	}
}
class P2 extends P1
{
void display()
{
	System.out.println("NAOH");
}
}
class abstp12
{
public static void main(String args[])
{
	p1 obj = new p2();//how to print add
	obj.display();
	obj.hello();
}

}