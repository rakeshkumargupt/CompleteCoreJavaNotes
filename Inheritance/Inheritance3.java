class Employee
{
	int empid=1234;
    	String empname="AAA";
}
class MKTEmployee extends Employee
{

void print()
	{
	System.out.println("Empid: " + empid);
	System.out.println("EmpName: " + empname);
	}
}
class Inheritance3
{
public static void main(String args[])
	{
	MKTEmployee obj = new MKTEmployee();
	obj.print();
	}
}