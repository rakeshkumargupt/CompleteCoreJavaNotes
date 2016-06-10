class Employee //logical representation of some real world entity
{
	//data member
	int i=1001;
	int employeeId;
	String name;
	String dept;
	int salary;	
	static String company_name;

	void printEmployee()
	{
	System.out.println("Employee Id : " +employeeId);
	System.out.println("Name : " + name);
	System.out.println("Department : " + dept);
	System.out.println("Salary : " + salary);
	}

	//Constructor - Parameterised Constructor
	Employee(String n,String d,int sal)
	{
	employeeId=i++; //post fix
	name = n;
	dept = d;
	salary = sal;
	printEmployee();
	}
}

class Test4
{
	public static void main(String args[])
	{
	
	//Creating Object of Employee class to access data member

	Employee emp1 = new Employee("Ram","IT",20000);
	Employee emp2 = new Employee("John","MKT",25000);
	Employee emp3 = new Employee("John1","MKT",25000);
	Employee emp4 = new Employee("John2","MKT",25000);

	}
}



