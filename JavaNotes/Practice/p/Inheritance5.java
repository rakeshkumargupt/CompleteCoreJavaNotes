class Employee
{
int id;
String name;
void setdata(int id,String name)
{
this.id=id;
this.name=name;
}
void print()
{
System.out.print("id = " + id);
System.out.print("name = " + name);
}
}
class Inheritance5
{
public static void main(String args[])
{
	Employee emp = new Employee();
	emp.setdata(111,"Ram Singh");
	emp.print();

//id=???  //111
//name=??? /Ram Singh

}

}