import java.io.*;

class  CurrentDir1 
{
public static void main(String args[])
{
File dir = new File(args[0]);
String[] children = dir.list();

if (children == null) {
    // Either dir does not exist or is not a directory
} 
else 
{
    for (int i=0; i<children.length; i++) {
        // Get filename of file or directory
        String filename = children[i];
	System.out.println(filename);
    }
}

}
}

