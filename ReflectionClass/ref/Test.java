class Simple
{
int i;
}

class Dummy
{
int j;
}

class Test{ 

public static void main(String args[]){ 

try
{
Class c=Class.forName("Simple"); 

System.out.println(c.getName()); 

c = Class.forName("Dummy");
System.out.println(c.getName()); 

}
catch(Exception ex)
{
ex.printStackTrace();
}
} 

} 
