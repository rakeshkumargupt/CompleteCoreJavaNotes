class array04
{

public static void main(String args[])
{
//example of two dimensional static array

	String str[][] = new String[2][2];

	str[0][0] = "1001";
	str[0][1] = "Rajesh";

	str[1][0] = "1002";
	str[1][1] = "Mukesh";

	System.out.println("RollNo. : " + str[0][0]);
	System.out.print("\tName: " + str[0][1]);
	System.out.println("\nRollNo. : " + str[1][0]);
	System.out.println("\tRollNo. : " + str[1][1]);

}
}