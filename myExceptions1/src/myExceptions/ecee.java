package myExceptions;

public class ecee {
	public static void main(String args[]) {
		//String str = null;
		//System.out.println(str.length());
		try {
			int a = 30 , b = 0;
			int c = a/b;
			System.out.println("result:"+c);
			
		}
		catch(ArithmeticException e) {
			System.out.println("number can't be divided by zero");
		}
		try {
			int num = Integer.parseInt("exception");
			System.out.println(num);
		}
		catch(NumberFormatException e) {
			System.out.println("number format exception");
		}
		try {
			int s[] = new int[5];
			s[9]=6;
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("exception array index out of bounds");
		}
	}

}
