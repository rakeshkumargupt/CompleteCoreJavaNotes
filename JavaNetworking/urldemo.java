//Program to demonstrate URL
import java.net.*;
import java.io.*;
public class urldemo
   {
      public static void main(String args[ ])throws Exception
         {
             URL u=new URL("http://java.sun.com:80/docs/index#down");
             System.out.println("Protocol : "+u.getProtocol( ));
             System.out.println("Host : "+u.getHost( ));
             System.out.println("Filename : "+u.getFile( ));
             System.out.println("Port : "+u.getPort( ));
             System.out.println("Reference : "+u.getRef( ));
        }
   }
/*
Output
Protocol : http
Host : java.sun.com
Filename : /docs/index URI
Port : 80
Reference : down
*/ 