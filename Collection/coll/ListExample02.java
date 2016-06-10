import java.util.*;

class Employee
{
int empid;
String name;

Employee(int id,String n)
{
	empid=id;
	name=n;
}
}
public class ListExample02 {

    public static void main(String[] args) {

        List<Employee> mylist = new ArrayList<Employee>();
        mylist.add(new Employee(1,"Rakesh"));
        mylist.add(new Employee(2,"Pawan"));
        System.out.println(mylist);
	System.out.println(mylist.size());
 	    }
    
}