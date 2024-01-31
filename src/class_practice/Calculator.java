package class_practice;

class DivisionByZeroException extends Exception {
    public DivisionByZeroException(String message) {
        super(message);
    }
}
public class Calculator {
	
	public static double divide(int num, int denom) throws DivisionByZeroException {
        if (denom== 0) {
            throw new DivisionByZeroException("Cannot divide by zero");
        }
        return num/ denom;
    }
  
}
