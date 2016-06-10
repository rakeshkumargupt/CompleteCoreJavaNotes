class Employee //logical representation of some real world entity
{
	//data member
	int employeeId;
	String name;
	String dept;
	int salary;	

}

class Test
{
	public static void main(String args[])
	{
	
	//Creating Object of Employee class to access data member

	Employee emp1 = new Employee();
	System.out.println("Employee Id : " + emp1.employeeId);
	System.out.println("Name : " + emp1.name);
	System.out.println("Department : " + emp1.dept);
	System.out.println("Salary : " + emp1.salary);

	Employee emp2 = new Employee();
	System.out.println("Employee Id : " + emp2.employeeId);
	System.out.println("Name : " + emp2.name);
	System.out.println("Department : " + emp2.dept);
	System.out.println("Salary : " + emp2.salary);


	}
}



