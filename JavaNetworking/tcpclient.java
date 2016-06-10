//Chatting program using TCP/IP tcpclient.java
import java.io.*;
import java.net.*;
public class tcpclient
   {
       public static void main(String args[ ])throws Exception
          {
             Socket s=null;
             BufferedReader b=null;
             try
               {
                  s=new Socket(InetAddress.getLocalHost( ),98);
                  //if to connect another machine in the network, specify the IP address
                  // for example s=new Socket(192.168.1.55,98);
                  b=new BufferedReader(new InputStreamReader(s.getInputStream( )));
               }
             catch(UnknownHostException e)
               {
                  System.out.println("Host not found");
                  System.exit(1);
               }
             String msg;
             while((msg=b.readLine( ))!=null)
               {
                     System.out.println(msg);
               }
             b.close( );
             s.close( );
       }
   }         