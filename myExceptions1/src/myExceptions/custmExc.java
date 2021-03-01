package myExceptions;

public class custmExc {


 
	  
	   static void validate(int age)throws InvalidAgeException{  
	     if(age<18)  
	      throw new InvalidAgeException("not valid age (you cannot enjoy the ride)");  
	     else  
	      System.out.println("eligible to enjoy the ride");  
	   }  
	     
	   public static void main(String args[]){  
	      try{  
	      validate(15);  
	      }catch(Exception e)
	      {
	    	  System.out.println("Exception occured: "+e);
	      }    
	  }  
	}  
class InvalidAgeException extends Exception{  
	 InvalidAgeException(String s){  
	  super(s);  
	 }  
	} 