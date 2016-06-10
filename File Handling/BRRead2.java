// Use a BufferedReader to read characters from the console.
//Standard Input console (Keyboard)
import java.io.*;

class BRRead2 {

public static void main(String args[])
throws IOException
{
//char c;
int c;
//InputStreamReader inp = new InputStreamReader(System.in);
BufferedReader br = new
BufferedReader(new InputStreamReader(System.in));

System.out.println("Enter characters, 'q' to quit.");

// read characters

do {
//to type cast convert into char

c = br.read();  //ascii value A=65
//c = br.read();
System.out.println(c);
} while(c != 'q');
}
}


