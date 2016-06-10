//Program to demonstrate getAllByName() method
import java.net.*;
import java.io.*;
public class dns
   {
      public static void main(String args[ ])throws IOException
         {
            try
               {
                  InetAddress[ ]address=InetAddress.getAllByName("localhost"); 
                  for(int a=0;a<address.length;a++)
	       System.out.println(address[a]);
              }
            catch(Exception e)
              {
            	      System.out.println(e);
              }	              
         }
   }   

/*
This program require that the computer to be connected to the Internet.
If not connected in Internet, program will give error message otherwise the IP address of  the java.sun.com. 
*/

/*
Domain Name			IP Address
www.google.com			192.168.1.12
www.rediff.com			192.169.1.12
www.yahoo.com			192.162.1.12
*/