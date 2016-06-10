import java.util.*;

public class HTDemo1 {

    public static void main(String[] args) {
Hashtable h = new Hashtable();
h.put("Google","http://www.google.com");
h.put("Yahool","http://www.yahoo.com");
h.put("Ram3",14000);
h.put("Ram4",15000);

Enumeration names;
String str;
double bal;
names = h.keys(); //it will retrieve all the keys from the collection
//hasMoreElements() - return true if collection has some item

while(names.hasMoreElements()) {
str = (String) names.nextElement();//to get the data from the collection
System.out.println(str + ": " +
h.get(str)); //to get the value for the given key

    }

bal = ((Integer)h.get("Ram2")).doubleValue();
h.put("Ram2", new Double(bal+1000));
System.out.println("Ram2's new balance: " +
h.get("Ram2"));
    
}
}