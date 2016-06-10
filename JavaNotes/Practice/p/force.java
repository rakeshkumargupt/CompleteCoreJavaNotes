import java.util.*;

class force
{
	public static void main(String args[])
	{  
           Scanner obj = new Scanner(System.in);
           System.out.print("Enter your mass");
          int m=Integer.parseInt(obj.nextLine());
           System.out.print("Enter your velocity");
          int v=Integer.parseInt(obj.nextLine());
           System.out.print("Enter your redias");
           int r=Integer.parseInt(obj.nextLine());
           int f;
            f=(m*v^2)/r;
           System.out.print("Your forces :" + f );

		
	}
}