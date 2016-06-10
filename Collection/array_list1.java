import java.util.*;

class array_list1
{
public static void main(String args[])
{
	List<Integer> mylist = new ArrayList<Integer>();
	mylist.add(12);
	mylist.add(15);
	Collections.sort(mylist);
	System.out.println(mylist);

	System.out.println("Size : " + mylist.size());

}
}