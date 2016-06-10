// Simple types are passed by value. Example of Call by value
class Test {
void meth(int a, int b) {
a = 25;
b = 50;
System.out.println("a and b inside function: " +
a + " " + b);

}
}
class func05 {
public static void main(String args[]) {
Test ob = new Test();
int a = 15, b = 20;
System.out.println("a and b before call: " +
a + " " + b);
ob.meth(a, b);
System.out.println("a and b after call: " +
a + " " + b);
}
}