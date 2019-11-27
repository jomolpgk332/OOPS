package strings;
import java.util.*;
public class Main {
	  public static void main(String [] args)
	  {
	    Scanner s=new Scanner(System.in);
		  int n=s.nextInt();
		  
		 /* for(i=n;i>=0;i++){
		  for(j=n;j<=0;j++){
		  System.out.printf("%c",j+65);
		  }
			  System.out.printf("\n");
		  }
		  for(i=0;i<=n;i++){
		  for(j=0;j<=i;j++){
		  System.out.printf("%c",j+65);
		  }
			  System.out.printf("\n");
		  }*/
for (int i = 0; i <= 5; i++)
{
    //int alphabet = 65;
    for (int j = 0; j <= i; j++)
    {
        System.out.printf("%c",i+65);
    }
    System.out.println();
}
for (int i = 5; i >= 0; i--)
{
    int alphabet = 65;
    for (int j = 0; j <= i - 1; j++)
    {
        System.out.printf("%c",j+65);
    }
    System.out.println();
}
}
}
