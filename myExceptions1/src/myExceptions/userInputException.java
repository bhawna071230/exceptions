package myExceptions;

public class userInputException {
	public static void main(String args[]) {
		try {
			throw new MyException(7);
		}
		catch(Exception e){
			System.out.println(e);
		}
	}

}
class MyException extends Exception{
	int a ;
	MyException(int b){
	a=b;
}
	public String toString() {
		
		return ("the result is:"+a);
	}}
