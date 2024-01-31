package lab7;


class InvalidCredentialsException extends Exception{
	
	public InvalidCredentialsException(String str) {
		super(str);
	}
}

class UserAuthentication{
	public void login(String user, String password) throws InvalidCredentialsException {
		String exuser= "sandeep";
		String expass= "san@134";
		if(!user.equals(exuser) || !password.equals(expass)){
			throw new InvalidCredentialsException("Invalid login credential");
			
		}
		else {
			System.out.println("login successfull");
		}
	}
}
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserAuthentication us=new UserAuthentication();
		try {
			us.login("sandeep", "san@134");
		}
		catch(InvalidCredentialsException e){
			System.out.println("login failed"+e.getMessage());
		}

	}

}
