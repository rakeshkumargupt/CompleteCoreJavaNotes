class mythread2 extends Thread
{
	mythread2()
	{
		super("mythread2");
		System.out.println(this);
		start();
	}

	public void run()
	{
		task();		
	}
static void task()
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