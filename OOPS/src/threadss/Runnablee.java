package threadss;
class B implements Runnable{
	public void run{
		System.out.println("Thread is running");
	}
}
public class Runnablee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b=new B();
		Thread t=new Thread();
		t.start();
	}

}
