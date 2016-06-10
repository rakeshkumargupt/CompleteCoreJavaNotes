import java.io.*;
class seq
  {
     public static void main(String args[])throws IOException
          {
             int i;
             if(args.length==0 || args.length==1 ||args.length==2 )	
               {
                   System.out.println("Invalid arguments");
                   System.out.println("java seq <sourcefilename1> <sourcefilename2> <destinationfilename>");
               }    
             else
               {
                   FileInputStream f1=new FileInputStream(args[0]);
                   FileInputStream f2=new FileInputStream(args[1]);
                   SequenceInputStream sis=new SequenceInputStream(f1,f2);
                   FileOutputStream f3=new FileOutputStream(args[2]);
                   do
                       {
                          i=sis.read();
                          f3.write(i);
                      }while(i!=-1);
                   sis.close();
                   f3.close(); 
              }
        }
  }

 
