class test_thread
{
	public static void main(String args[])
	{
		mythread ob1 = new mythread();
	try
		{		
		ob1.join();
		}
	catch(Exception ex)
		{
		}

		int x=25;
		for(int j=0;j<4;j++)
		{
		x=+25;
		  try
			{
			System.out.println("finising installation..." + x + "%");
			Thread.sleep(500);
			
			}
	          catch(InterruptedException e)
			{
			}
		}
	}
}