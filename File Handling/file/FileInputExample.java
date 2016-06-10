//example of taking input from file stream and display the
//contents on the screen
import java.io.*;
class FileInputExample
  {
     public static void main(String args[]) throws IOException
         {
		
	   String filename = args[0];
            FileInputStream fi=new FileInputStream(filename);          
            int r;
            System.out.println("Contents of the file : "+filename);
            while((r=fi.read())!=-1)
                 System.out.print((char)r);
            fi.close();
        }
  }
