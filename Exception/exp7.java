class SpaatNumberException extends Exception
{
public SpaatNumberException()
{
System.out.println("error in program!");
}
}

class InvalidResultException extends Exception
{
public InvalidResultException ()
{
System.out.println("Result cannot be less than 5!");
}
}
class exp7
{
public static void main(String args[])
{
try
{
int a=25;
int b=20;
if(a < b)
throw new SpaatNumberException();
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
catch(InvalidResultException ex)
{
System.out.println(ex);
}
}

}