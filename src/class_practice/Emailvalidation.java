package class_practice;
class InvalidEmail extends RuntimeException {
    public InvalidEmail(String message) {
        super(message);
    }
}
public class Emailvalidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String email="sandeep123@gamil.com";
			if(cheackemailvalidation(email)) {
				System.out.println("Valid email address!");
			}
		}
		catch (InvalidEmail e) {
            System.out.println(e.getMessage());
        }
		

	}

	private static boolean cheackemailvalidation(String email) {
		  
		if (email.contains("@") && email.contains(".")) {
            if (email.indexOf("@") > 0 && email.indexOf(".") < email.length() - 1 && email.indexOf("@") < email.indexOf(".")) {
                return true;
            }
        }
        throw new InvalidEmail("this email is not valid");
    }
        
  }


