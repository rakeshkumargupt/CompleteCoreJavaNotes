import java.lang.reflect.*;

class spaat
{
public void a() { } 

public int b(int a, int b) { return a+b; }
}


class Test4
{
public static void main(String args[])
{
try
{
	Class c=Class.forName("spaat"); 

System.out.println(c.getName());

 Method m[] = c.getDeclaredMethods();

for(Method mm : m)
System.out.println(mm);

}

catch(Exception ex)
{
ex.printStackTrace();
}
}
}
