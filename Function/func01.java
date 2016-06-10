//Example of function in the same class
class func01 {

public static void main(String args[])
{
int a=5;int b=10;
calculate(a,b); // calling the function
a=50;b=100;
calculate(a,b);
}
//declaring the function parameterised but not return value
static void calculate(int a, int b)
{
int z=0;
if(a > b)
z = a/b;
else if(a < b)
z = a + b;
else 
z = a * b;
System.out.println("Result : " + z);
}


}