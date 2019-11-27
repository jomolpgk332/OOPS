package threadss;
public class C extends Thread{
	public void run() {
		for(int i=0;i<=5;i++) {
			if(i==1)yield();
		
			System.out.println("Car A is running"+i);
		}
		System.out.println("Car A running is completed");
	}
}
class C1 extends Thread{
	public void run() {
		int i;
		for( i=0;i<=5;i++) {
			if(i==2)stop();
			{
			System.out.println("Car B is running"+i);
		}
	}
		System.out.println("Car B running is completed");
	}
}
	class C3 extends Thread{
		public void run() {
			int i;
			for( i=0;i<=5;i++) {
				if(i==3)
				{
					try {
						System.out.println("Car B is running"+i);
						Thread.sleep(10000);
					}
					catch(InterruptedException e) {
						e.printStackTrace();//syso
					}
				}
			}
		}
	}
public class Sleep {

	public static void main(String[] args) {
		C c=new C();
		C1 c1=new C1();
		C3 c3=new C3();
		c.run();
		c1.run();
		c3.run();
		
	}

}
