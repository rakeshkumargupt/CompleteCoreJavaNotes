//Example of function in the different class
class Calculator {

//declaring the function parameterised with return value
int calculate(int a, int b)
{
int z=0;
if(a > b)
z = a/b;
else if(a < b)
z = a + b;
else 
z = a * b;
return z;
}

}

class func04 {

public static void main(String args[])
{
//creating object of Calculator class to access its member
Calculator calc = new Calculator();
int a=5;int b=10;
int result = calc.calculate(a,b); // calling the function
System.out.println(result);
a=50;b=100;
result = calc.calculate(a,b);
System.out.println(result);
}


}