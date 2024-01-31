package class_practice;
class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}
public class BankAccount {
  private int Balance;
  private int Deposite;
  
  			public int getBalance() {
  					return Balance;
  			}
  			public void setBalance(int balance) {
  					Balance = balance;
  				}
  			public int getDeposite() {
  					return Deposite;
  				}
  			public void setDeposite(int deposite) {
  					Deposite = deposite;
  					Balance +=Deposite;
  			}
  			public void getWithdraw(int amount ) throws InsufficientFundsException{
  				if (amount > Balance) {
  		            throw new InsufficientFundsException("Insufficient funds. Current balance: " + Balance);
  		        } else {
  		            Balance -= amount;
  		            System.out.println("Withdrawal successful. New balance: " + Balance);
  		        }
				
  			}
  			
public BankAccount(int balance, int deposite) {
	super();
	Balance = balance;
	Deposite = deposite;
}
public BankAccount() {
	super();
	// TODO Auto-generated constructor stub
}
  

}
