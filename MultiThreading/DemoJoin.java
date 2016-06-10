// Using join() to wait for threads to finish.
class NewThread implements Runnable {
String name; // name of thread
Thread t;
NewThread(String threadname) {
name = threadname;
t = new Thread(this, name);
System.out.println("New thread: " + t);
t.start(); // Start the thread
}
// This is the entry point for thread.
public void run() {
try {
for(int i = 5; i > 0; i--) {
System.out.println(name + ": " + i);
Thread.sleep(1000);
}
} catch (InterruptedException e) {
System.out.println(name + " interrupted.");
}
System.out.println(name + " exiting.");
}
}
class DemoJoin {
public static void main(String args[]) {
NewThread ob1 = new NewThread("thread 00");
NewThread ob2 = new NewThread("thread 01");

System.out.println("Thread One is alive: "+ ob1.t.isAlive());
// wait for threads to finish
try {
ob1.t.join();
}
catch (InterruptedException e) {
}

//do the necessary task
System.out.println("Thread One is alive: " + ob1.t.isAlive());
System.out.println("Main thread exiting.");
}
}