class Pdrame
{

public static void main(String args[])
    {
	String arr[] = new String[5];

	arr[0] = "NN";
	arr[1] = "II";
	arr[2]  = "TT";
	arr[3] = "II";
	arr[4]  = "NN";
	for(int i=0;i<=5;i++)
        System.out.print(arr[i]);

for(int i=0;i<=5;i++)
{
  if(arr[i]==arr[5-i])
  System.out.print("palindrome success");
 }
}
}