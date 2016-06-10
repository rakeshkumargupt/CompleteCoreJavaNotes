
class Test2
{ 
public static void main(String args[]){ 

try
{
Class c=Class.forName("java.lang.String"); 

System.out.println(c.getName()); 

System.out.println("Super : "+ c.getSuperclass());
}
catch(Exception ex)
{
ex.printStackTrace();
}
} 

} 
