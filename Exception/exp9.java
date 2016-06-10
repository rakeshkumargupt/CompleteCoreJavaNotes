class SpaatNumberException extends Exception
{
public SpaatNumberException(String err)
{
System.out.println("error: " + err);
}
}

class InvalidResultException extends Exception
{
public InvalidResultException ()
{
System.out.println("Result cannot be less than 5!");
}
}
class exp9
{
public static void main(String args[])
{
try
{
int a=5;
int b=20;
if(a < b)
throw new SpaatNumberException("The number a=" + a + " cannot be less than number b="+b);
else
{
int c = a/b;
if(c <5)
throw new InvalidResultException();
else
System.out.println("result = " + c);
}
}
catch(SpaatNumberException ex)
{
System.out.println(ex);
}
catch(Exception ex)
{
System.out.println(ex);
}
}

}