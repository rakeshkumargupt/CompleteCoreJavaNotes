interface B
{
void display();
void hello();
}

class C implements B
{
public void display() 
	{ 
		System.out.println("from display"); 
	} 
	public void hello() 
	{
	System.out.println("from hello");
	}

}

class D
{
public static void main(String args[])
{
	C obj = new C();
	obj.display();
	obj.hello();
}
}