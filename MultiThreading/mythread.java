class mythread extends Thread
{
	mythread()
	{
		super("mythread");
		System.out.println(this);
		start();
	}

	public void run()
	{
		for(int i=0;i<5;i++)
		{
			try
			{
			System.out.println("Welcome! " + i);
			Thread.sleep(500);
			}
			catch(InterruptedException ex)
			{
				System.out.println("error : " + ex);
			}
		}
	}
}