class Swapper<T>
{
void swap(T a, T b)
{
T c;
c = a;
a = b;
b = c;

System.out.println(a);
	System.out.println(b);
}
}

class Test
{
public static void main(String args[])
{
	
	Swapper<Integer> m = new Swapper<Integer>();
	m.swap(5,10);

	Swapper<String> m2 = new Swapper<String>();
	m2.swap("Hi...","Bye...");

}
	
}