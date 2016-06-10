class A
{
 void hello() { System.out.println("Hello!"); }

public void bye() { System.out.println("Bye!"); } 

}
class B extends A
{
void hello() { System.out.println("Hello again!"); }
}
class D1 
{
public static void main(String args[])
{
	B obj = new B();
	obj.hello();
	obj.bye();
}
}