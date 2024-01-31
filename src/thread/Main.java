package thread;

class F1 extends Thread{
	public void run(){
		int i=4;
		while(i>0) {
			System.out.println("F1 thread runnig");
			i--;
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class F2 extends Thread{
	public void run(){
		int i=5;
		while(i>0) {
			System.out.println("F2 thread runnig");
			i--;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		F1 f1=new F1();
		F2 f2=new F2();
		f1.start();
		f2.start();
		

	}

}
