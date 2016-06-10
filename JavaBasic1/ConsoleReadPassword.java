import java.io.*;
class ConsoleReadPassword{
   public static void main(String args[]){
     Console obj = System.console();
     String pass = new String(obj.readPassword("Enter your password :" ));
     System.out.println("Your entered password is :-> " + pass );
    }
}


