import java.net.*;
import java.io.*;
public class find
   {
      public static void main(String args[ ])throws IOException
         {
            InetAddress a=InetAddress.getLocalHost();
            System.out.println("Host and address "+a);
            System.out.println("Host Name "+a.getHostName());
            String s=a.toString();
            System.out.println("IP Address "+s.substring(s.indexOf("/")+1));
        }
   }   

/*
output:
Host and address home/127.0.0.1 - by default ip of localhost
Host Name home
IP Address 127.0.0.1
*/
