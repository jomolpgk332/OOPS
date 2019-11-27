package pattern;

import java.util.Scanner;

public class Series5 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=s.nextInt();
		int arr[]=new int[n];
		int a=0,ss=0,i=0;
		for(i=0;i<n;i++) {
			if(i%2==0) {
				arr[i]=a;
			}
			else
			{
				ss=a/2;
				
				a=a+2;
				arr[i]=ss;
			}
			System.out.print(arr[n-1]+" ");
		}
	}

}
