//example of taking input from file stream and display the
//contents on the screen
import java.io.*;
class FileIn
  {
     public static void main(String args[]) throws IOException
         {
		
	   String filename = "test.txt";
            FileInputStream fi=new FileInputStream(filename);          
            int r;
            System.out.println("Contents of the file : "+filename);
            while((r=fi.read())!=-1)
                 System.out.print((char)r);
            fi.close();
        }
  }
