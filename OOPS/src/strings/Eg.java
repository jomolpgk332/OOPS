package strings;
import java.util.Scanner;
class Eg
{
  public static void main(String [] args)
  {
    Scanner s=new Scanner(System.in);
    int sum=0,max=0,min=0,i;
	  System.out.println("Enter the index of array");
	  int n=s.nextInt();
	  System.out.println("Elements in array are:");
	  int a[]=new int[n];
	  for( i=0;i<=n;i++){
	  a[i]=s.nextInt();
	  }
	  for( i=0;i<n;i++){
	  sum=sum+a[i];
		  System.out.println("sum"+sum);
	  }
		  for( i=0;i<=n;i++){
		  max=a[i];
		  }
		   System.out.println("maximum element is"+max);
	   for( i=0;i<n;i++){
		   if(min>a[i]){
			   System.out.println("minimum element is"+min);
		  
	  }
	  
  }
}
}