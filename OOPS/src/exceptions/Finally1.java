package exceptions;

public class Finally1 {

	public static void main(String[] args) {
		try {
			int m[]=new int[5];
			m[10]=50/2;
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		catch(Exception e) {
		System.out.println(e);
		}
		finally {
			System.out.println("pgm closed");
		}
		
	}


	}

