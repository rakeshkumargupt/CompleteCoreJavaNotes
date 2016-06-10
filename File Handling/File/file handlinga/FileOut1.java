import java.io.*;
class FileOut1
  {

 public static void main(String args[]) throws IOException
         {
 InputStreamReader io=new InputStreamReader(System.in);
 
        BufferedReader br1=new BufferedReader(io);

System.out.println("Enter the file name with extension ");

//to prompt for the file name to read i.e. hello.txt    
	
	    String filename=br1.readLine(); 
		//to open the file in the FileOutputStream

FileReader fr = new FileReader(filename);

BufferedReader br = new BufferedReader(fr);

String s;
FileOutputStream fo=new FileOutputStream("fileout.txt");
System.out.flush(); //to clear the buffer

while((s = br.readLine()) != null) {

//to write the contents in the file
            for(int i=0;i<s.length();i++) //abcd
{
                 fo.write(s.charAt(i));
System.out.print(s.charAt(i));
}


}
fr.close();
fo.close(); //to close the file

        }
  }
