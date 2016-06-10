i	class Employee
{
	int empid=1234;
    	String empname="AAA";
}
class MKTEmployee\\ extends Employee
{
int empid=4545;
String empname="BBB";
void print()
	{
	System.out.println("Empid: " + super.empid);
	System.out.println("EmpName: " + super.empname);
	}
}
class Inheritance44
{
public static void main(String args[])
	{
	MKTEmployee obj = new MKTEmployee();
	obj.print();
	}
}