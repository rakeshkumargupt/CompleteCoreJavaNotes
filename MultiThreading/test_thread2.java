class test_thread2
{
	public static void main(String args[])
	{
		mythread2 ob1 = new mythread2();
	
		for(int j=0;j<4;j++)
		{
		
		  try
			{
			System.out.println("main thread : "+j);
			Thread.sleep(500);
			
			}
	          catch(InterruptedException e)
			{
			}
		}
	}
}