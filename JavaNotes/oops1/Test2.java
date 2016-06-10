class Employee //logical representation of some real world entity
{
	//data member
	int employeeId;
	String name;
	String dept;
	int salary;	

	void printEmployee()
	{
	System.out.println("Employee Id : " +employeeId);
	System.out.println("Name : " + name);
	System.out.println("Department : " + dept);
	System.out.println("Salary : " + salary);
	}
}

class Test2
{
	public static void main(String args[])
	{
	
	//Creating Object of Employee class to access data member

	Employee emp1 = new Employee();
		emp1.printEmployee();
	Employee emp2 = new Employee();
	emp2.printEmployee();
	}
}



