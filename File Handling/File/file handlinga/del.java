//PROGRAM TO GET AN INPUT AS FILE NAME AND DELETE IT

import java.io.*;
class del
  {
     public static void main(String args[])throws IOException
       {
          InputStreamReader io=new InputStreamReader(System.in);
          BufferedReader br=new BufferedReader(io);
          System.out.println("Enter file name with extension to be delete ");
          String filename= br.readLine();	

          File f=new File(filename);
          if(f.exists() && f.isFile())
               {
                    f.delete();
                    System.out.println("File deleted ");
               }
          else
               {
                    System.out.println("File not found ");
               }
       }
  }
