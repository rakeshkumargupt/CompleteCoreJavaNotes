// A simple example of recursion.
class Factorial {
// this is a recursive function

	int fact(int n) 
	{
	int result;
	if(n==1) return 1;
	result = fact(n-1) * n;  ///1-1 * n
	return result;
	}
}
class func07 {
public static void main(String args[]) {
Factorial f = new Factorial();
System.out.println("Factorial of 3 is " + f.fact(3));
System.out.println("Factorial of 4 is " + f.fact(4));
System.out.println("Factorial of 5 is " + f.fact(9));
}
}