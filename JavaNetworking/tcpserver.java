//Chatting program using TCP/IP (Socket and Server socket)
import java.io.*;
import java.net.*;
public class tcpserver
   {
       public static void main(String args[ ])throws Exception
          {
              ServerSocket s1=null;
              try
                  {
                     s1=new ServerSocket(98);
                  }
              catch(IOException e)
                 {
                    System.out.println("Could not found port 98");
                    System.exit(1);
                 }
              Socket c=null;
              try
                 {
                    c=s1.accept( );
                    System.out.println("Connection found "+c );
                 }
             catch(IOException e)
                 {
                    System.out.println("Accept failed");
                    System.exit(1);
                 }      
             PrintWriter out=new PrintWriter(c.getOutputStream( ),true);
             InputStreamReader in=new InputStreamReader(c.getInputStream( ));
             BufferedReader br=new BufferedReader(in);
             BufferedReader sin=new BufferedReader(new InputStreamReader(System.in));
             System.out.println("Ready to chat ");
             String msg;
             while((msg=sin.readLine( ))!=null)
                {
                     out.println(msg);
                }
             out.close( );
             sin.close( );
             c.close( );
             s1.close( );
          }
     }    