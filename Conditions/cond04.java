class cond04
{
public static void main(String args[])
	{
		int a=Integer.parseInt(args[0]);
		
			if(a==1)
				System.out.println("You are First Winner!!!");
			else if(a==2)
				System.out.println("You are Second Winner!!!");
			else if(a==3)
				System.out.println("You are Third Winner!!!");
			else
				{
				System.out.println("You loose!!!");
				System.out.println("Visit again!!!");
				}
			
	}
}