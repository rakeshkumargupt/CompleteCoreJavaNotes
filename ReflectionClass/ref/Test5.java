//to display all the method of String class
import java.lang.reflect.*;

class Test5
{ 
public static void main(String args[]){ 

try
{
Class c=Class.forName("java.lang.String"); 

System.out.println(c.getName()); 

System.out.println("Super : "+ c.getSuperclass());
System.out.println("isPrimitive : "+ c.isPrimitive());

Constructor m[] = c.getDeclaredConstructors();

int i=0;
for(Constructor mm : m)
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
