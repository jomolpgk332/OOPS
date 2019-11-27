package pattern;
import java.util.*;
public class Series1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=s.nextInt();
		int a=11;
		int b=0,i;
		for(i=0;i<=n;i++) {
			b=(a*a);
			System.out.print(b);
			System.out.print(" ");

			a=a+4;
		}
		
	}

}
