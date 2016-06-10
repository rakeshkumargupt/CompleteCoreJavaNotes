import java.util.*;

class collect_1
{
public static void main(String args[])
{
	ArrayList mylist = new ArrayList();
	mylist.add("AAA");
	mylist.add("BBB");

int i = mylist.size();
 System.out.println("Total item in list: " + i);

System.out.println("Data : "+ mylist);
	mylist.add("CCC");
	mylist.add(111);
	mylist.add(true);
i = mylist.size();
 System.out.println("Total item in list: " + i);
System.out.println("Data : "+ mylist);

mylist.remove(0); //to remove the data by its index

i = mylist.size();
 System.out.println("Total item in list: " + i);


System.out.println("Data : "+ mylist);
mylist.remove("CCC"); //to remove data by object

i = mylist.size();
 System.out.println("Total item in list: " + i);

System.out.println("Data : "+ mylist);
if(mylist.contains("BBB")) //to check for the object in the list
{
    System.out.println("Item found!");
}
else
    System.out.println("item not found!");

mylist.set(1, "mydata");
 
String str =   mylist.get(2).toString();
  System.out.println(str);

System.out.println("Data : "+ mylist);

mylist.add(1, "SPAAT");
System.out.println("Data : "+ mylist);

System.out.println("Data : "+ mylist);
 int idx = mylist.indexOf("mydata");
System.out.println(idx);
if(mylist.isEmpty())
     System.out.println("no data in the list!");
 else
         System.out.println("total data in the list = " + mylist.size());
 
}
}