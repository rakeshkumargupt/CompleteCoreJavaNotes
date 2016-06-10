class math
{
	void calculation(int m,int v,int r) 
	{
		System.out.println(m*v^2/r);
	}
}
class accelaration extends math
{
	void calculate(int v,int r) 
	{
		System.out.println("v^2/r");
	}	
}
class percentageerrorforce extends math
{
	void calculation(int f,int v, int m,int r )
	{
		System.out.println("(f-(m*v^2/r)/f)");
	}	
}
class percentageerroraccelation extends math
{
void calculation(int a,int v,int r)
{
System.out.println("(a-(v^2/r)/a)");
}
}

class polyp6
{
	public static void main(String args[])
	{
	math obj=new math();
obj.calculation(2,3,4);	
obj.calculation(3,4,4);	
obj.calculation(2,3,4);	
obj.calculation(2,3,4);	
}
}
	
		
	
	
		