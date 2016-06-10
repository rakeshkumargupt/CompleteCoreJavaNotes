import java.util.*;

class array_list1
{
public static void main(String args[])
{
	ArrayList mylist = new ArrayList();

	System.out.println("Size : " + mylist.size());
	mylist.add("Hello");
	System.out.println("Size : " + mylist.size());
	mylist.add(1234);
	System.out.println("Size : " + mylist.size());
	mylist.add(true);
	System.out.println("Size : " + mylist.size());
	mylist.add(1234.56);
	System.out.println("Size : " + mylist.size());

	System.out.println(mylist);
	mylist.remove(1);
	System.out.println("Size : " + mylist.size());
	System.out.println(mylist);
	
if(mylist.contains("Hello"))
System.out.println("found!");
else
System.out.println("not found!");
	
mylist.clear();
	System.out.println(mylist);
		
}
}