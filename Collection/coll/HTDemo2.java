
package htdemo;
import java.util.*;

public class HTDemo {

    public static void main(String[] args) {
Hashtable balance = new Hashtable();
String str;
double bal;
balance.put("John Doe", new Double(3434.34));
balance.put("Tom Smith", new Double(123.22));
balance.put("Jane Baker", new Double(1378.00));
balance.put("Todd Hall", new Double(99.22));
balance.put("Ralph Smith", new Double(-19.08));

// show all balances in hashtable
Set set = balance.keySet(); // get set-view of keys
// get iterator
Iterator itr = set.iterator();
while(itr.hasNext()) {
str = (String) itr.next();
System.out.println(str + ": " + balance.get(str));
}    
}
}
