class PasswordMismatchException extends Exception
{
public PasswordMismatchException()
{
System.out.println("Password and Confirm Password does not match!");
}
}

class exp10
{
public static void main(String args[])
{
String password="aaa";
String confirmPassword="bbb";
try
{
if(!password.equals(confirmPassword))
throw new PasswordMismatchException();
else
System.out.println("password changed!");
}
catch(PasswordMismatchException ex)
{
System.out.println(ex);
}
}
}