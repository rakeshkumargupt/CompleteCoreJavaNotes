class loop11
{
public static void main(String args[])
{

int a[] = new int[5];
a[0] = 1111;
a[1] = 1112;
a[2] = 1113;
a[3] = 1114;
a[4] = 1115;

for(int s : a)
{
try
{
Thread.sleep(500);
System.out.println(s);
}
catch(Exception ex)
{
}
}



for(int i=0;i<5;i++)
System.out.println(a[i]);
		
}
}
