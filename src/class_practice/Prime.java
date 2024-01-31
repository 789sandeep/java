package class_practice;

class NonPrimeException extends Exception {
	 public NonPrimeException(String message) {
	        super(message);
	    }
}


public class Prime {
	public static  boolean isprime(int a) {
		if(a<=1) {
			return false;
		}
		
		for(int i=2; i<a; i++) {
			
			if(a%i==0) {
				return false;
			}
		}
		return true;
	}
	 public static void checkprimeornot(int a)throws NonPrimeException {
		 if(isprime(a)) {
			 System.out.println("this number is prime:"+a);
		 }
		 else {
			 throw new NonPrimeException("this number is not a prime number:"+a);
		 }
	 }
	
	public static void main(String[] args) throws NonPrimeException {
		// TODO Auto-generated method stub
			
			 try {
				    int a=5;
		            checkprimeornot(a);
		        } catch (NonPrimeException e) {
		            System.out.println(e.getMessage());
		        }
					
		
		

	}

}
