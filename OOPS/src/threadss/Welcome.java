package threadss;

import java.util.Scanner;

class Ca extends Thread{
	public void run() {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=s.next();
		for(int i=0;i<str.length();i++) {
			char c=str.charAt(i);
			try {
				System.out.println(c);
				Thread.sleep(15000);
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
		}
	}
}
public class Welcome {

	public static void main(String[] args) {
		Ca t=new Ca();
		t.start();

	}

}
