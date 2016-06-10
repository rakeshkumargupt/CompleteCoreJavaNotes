import java.util.*;

 class ListExample3{

    public static void main(String[] args) {

        List<Integer> mylist = new ArrayList<Integer>();
        mylist.add(1);
        mylist.add(2);
        System.out.println(mylist);
        
      List<String> mylist2 = new ArrayList<String>();
      mylist2.add("Ram");
      mylist2.add("Shyam");
      mylist2.add("Rakesh");
      System.out.println(mylist2);
      
      
      List<Employee2> emplist = new ArrayList<Employee2>();
      emplist.add( new Employee2(1001, "Ram"));
      emplist.add( new Employee2(1002, "Shyam"));
      
      System.out.println(emplist);
      
      
      
    }
    
}

class Employee2
{
    int empid;
    String name;
    
    Employee2(int id, String n)
    {
        empid=id;
        name=n;
    }
}