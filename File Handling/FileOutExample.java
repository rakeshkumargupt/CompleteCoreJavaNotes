import java.io.*;
class FileOutExample
  {
 public static void main(String args[]) throws IOException
         {
 InputStreamReader io=new InputStreamReader(System.in);
 
        BufferedReader br=new BufferedReader(io); //1024

System.out.println("Enter the file name with extension ");

//to prompt for the file name to be created i.e. hello.txt    
	
	    String filename=br.readLine(); 
//to open the file in the FileOutputStream

FileOutputStream fo=new FileOutputStream(filename);

System.out.println("Enter the line of text here ");

System.out.flush(); //to clear the buffer

//to get the message from the user
		String s=br.readLine();
//to write the contents in the file

for(int i=0;i<s.length();i++) //abcd
	{
		if(i==10) fo.write('\n');
                 fo.write(s.charAt(i));
		//System.out.print(s.charAt(i));
	}

            fo.close(); //to close the file
		System.out.println("\nContents Saved in "+ filename);
        }
  }
