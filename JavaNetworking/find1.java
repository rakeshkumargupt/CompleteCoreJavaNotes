import java.net.*;
import java.io.*;
public class find1
   {
      public static void main(String args[ ])throws IOException
         {
            InputStreamReader io=new InputStreamReader(System.in);
            BufferedReader br=new BufferedReader(io);
            System.out.println("Enter the host name ");
            String s=br.readLine( );
            InetAddress i=InetAddress.getByName(s);
            System.out.println("IP Address "+i);
        }
   }   

/*
output:
Enter the host name : localhost
home
IP Address home/127.0.0.1
*/