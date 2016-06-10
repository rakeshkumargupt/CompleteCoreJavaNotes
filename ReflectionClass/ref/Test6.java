//to display all the method of String class
import java.lang.reflect.*;

class Test6
{ 
public static void main(String args[]){ 

try
{
Class c=Class.forName("java.util.Scanner"); 

System.out.println(c.getName()); 

System.out.println("Super : "+ c.getSuperclass());
System.out.println("isPrimitive : "+ c.isPrimitive());

Method m[] = c.getDeclaredMethods();

int i=0;
for(Method mm : m)
{
System.out.println(mm);
i++;
}

System.out.println("Total : " + i);


}
catch(Exception ex)
{
ex.printStackTrace();

}
} 

} 
