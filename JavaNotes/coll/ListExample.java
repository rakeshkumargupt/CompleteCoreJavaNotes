import java.util.*;

public class ListExample {

    public static void main(String[] args) {

List mylist;

        List<Integer> mylist = new ArrayList<Integer>();
        mylist.add(1);
        mylist.add(2);
        System.out.println(mylist);
	System.out.println(mylist.size());
 	mylist.add(10);
        mylist.add(20);
        System.out.println(mylist.size());
	mylist.remove(0);
	System.out.println(mylist.size());

	System.out.println(mylist.contains(10));
	System.out.println(mylist.get(1));
	mylist.clear();
	System.out.println(mylist.size());
    }
    
}