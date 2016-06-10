public class account extends Thread {

	static int balance=10000;

	public account(String id) {
		super(id);
	}

	public static void main(String[] args) {
		account thread1 = new account("Ac01: ");
		account thread2 = new account("Ac02: ");
		thread1.start();
		thread2.start();
		boolean t1IsAlive = true;
		boolean t2IsAlive = true;
		do {
			if (t1IsAlive && !thread1.isAlive()) {
				t1IsAlive = false;
				System.out.println("Ac1 is dead.");
			}
			if (t2IsAlive && !thread2.isAlive()) {
				t2IsAlive = false;
				System.out.println("Ac2 is dead.");
			}
		} while (t1IsAlive || t2IsAlive);
	}
	
	public synchronized void run() {
		SynchronizedOutput.displayList(getName(), balance);
	}
}


class SynchronizedOutput {

	
public synchronized static void displayList(String name, int bal) 
{
		
	account t = (account)Thread.currentThread();
			
			try
			{
			for(int i=0;i<10;i++)
			{
			bal=bal-1000;
			t.sleep(1000);
			System.out.println(name + bal);
			}
			}
			catch(InterruptedException ex)
			{
			}
		
	}
}
