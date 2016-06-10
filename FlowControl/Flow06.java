//example of ternary operator

import java.util.Scanner;

class Flow06
{
public static void main(String args[])
{
	int marks;
	Scanner obj = new Scanner(System.in);
	System.out.print("Enter marks : ");
	marks = obj.nextInt(); 

	String result = (marks >=50) ? " Passed " : "Fail";

	System.out.println("Result = " + result);
	
	
}
}