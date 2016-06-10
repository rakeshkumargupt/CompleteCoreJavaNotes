//to display all the method of String class
import java.lang.reflect.*;

class Test3
{ 
public static void main(String args[]){ 

try
{
Class c=Class.forName("java.lang.String"); 

System.out.println(c.getName()); 

System.out.println("Super : "+ c.getSuperclass());
System.out.println("isPrimitive : "+ c.isPrimitive());

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
