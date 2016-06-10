abstract class Employee
{
int empid;
string name;
int status;
 void calculate salary(int basic,inthra,int da);
void hello();
}
class Employeesalary extends Employee
{
void calculate salary(int basic,int hra, int da);
{system.out.println(basic+hra+da);
}
void hello(){}
}
class EmployeeData1
{
public static void main(string args[])
{
Employeesalary obj
=new Employeesalary();
obj.calculate salary(10000,2000,2000);
obj.hello();
}
} 














 