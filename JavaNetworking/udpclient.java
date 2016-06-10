//Client program using UDP udpclient.java
import java.io.*;
import java.net.*;
public class udpclient
   {
       public static DatagramSocket ds;
       public static byte buffer[ ]=new byte[1024];
       public static void myclient( ) throws Exception
         {          
            while(true)
               {
                  DatagramPacket p=new DatagramPacket(buffer,buffer.length);
                  ds.receive(p);
                  System.out.println(new String(p.getData( ),0,p.getLength( )));
              }
         }
       public static void main(String args[ ])throws Exception
         {
             System.out.println("Client- For quit press ctrl+c ");
             ds=new DatagramSocket(777);
             myclient( );
        }
  }    