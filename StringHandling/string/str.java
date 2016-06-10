class str
{
public static void main(String args[])
{
  String str1 = new String("ABC");//h001
        String str2 = new String("abc");//h002

        if(str1==str2)
            System.out.println("Matched!");
        else
            System.out.println("Not Matched!");

        if(str1.equals(str2))
        {
            System.out.println("Matched!");
        }
            else
         
                System.out.println("Not Matched!");

        if(str1.equalsIgnoreCase(str2))
        {
            System.out.println("Matched!");
        }
            else

                System.out.println("Not Matched!");
    }




}