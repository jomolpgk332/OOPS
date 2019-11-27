package pattern;

import java.util.Scanner;

public class Series4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=s.nextInt();
		int b=4;
		int i=0;
		while(i<n){
			b=b+(i*i);
			System.out.print(b);
			System.out.print(" ");
			i++;}
	}

}
