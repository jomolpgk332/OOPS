package exceptions;

//import java.util.Scanner;

public class Numberpointer {

	public static void main(String[] args) {
		//Scanner s=new Scanner(System.in);
		try {
			int num=Integer.parseInt ("XYZ") ;//in place of integer string is entered
			System.out.println(num);
		}
		
		catch(NumberFormatException e) {
			System.out.println("Number format exception occured");
		}
	}

}
