class Voters
{
int age;

	void print()
	{
	System.out.println("voters age : " + age);
	}
}


class encap01
{
public static void main(String args[])
{
	Voters v1 = new Voters();
	v1.age = 2;
	v1.print();
}
}