import java.util.*;
class Test2
{
public static void main(String args[])
{
	Scanner obj = new Scanner(System.in);
	System.out.print("Enter Title : ");
	String title = obj.nextLine(); //scanf()
	System.out.print("Enter Firstname : ");
	String fname = obj.nextLine();
	System.out.print("Enter Lastname : ");
	String lname = obj.nextLine();
	System.out.println("Title : " + title);
	System.out.println("Firstname : " + fname);
	System.out.println("Lastname : " + lname);
	String fullname = title + " " + fname + " " + lname;
	System.out.println("Fullname : "+ fullname);
}
}
