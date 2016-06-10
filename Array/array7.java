import java.util.*;
class array7
{
public static void main(String args[])
{
  //example of jagged array
            int [][]arr = new int[4][];
            arr[0]= new int[2]; //dynamically
            arr[1] = new int[3];
            arr[2] = new int[4];
            arr[3] = new int[1];
            arr[0][0] = 11;
            arr[0][1] = 12;

            System.out.println(arr[0][0]);
            System.out.println(arr[0][1]);
           

}
}