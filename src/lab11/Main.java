package lab11;

class Thread1 extends Thread{
	private static final Object lock = new Object();
	int countdown=10;
	public void run() {
		synchronized(lock){
			try {
				while(countdown>0) {
					System.out.println("Thread 1:"+countdown);
					countdown--;
					System.out.println("Thread 2:waiting....");
				Thread.sleep(1000);
				}
				lock.notify();
			} 
			catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
			
		}
	public void message() {
		synchronized(lock){
		try {
			lock.wait();
			System.out.println("Time's up!");
		} 
		catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  }
	}
}
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread1 th=new Thread1();
		th.start();
	    th.message();

	}

}
