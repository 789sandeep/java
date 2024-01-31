package class_practice;

abstract class Bank{
	abstract int getrateofintrest();
	void run() {
		System.out.println("This method is belong to abstract class and this method is non abstract method ");
	}
	int rs;
	public Bank() {
		this(1000);//call private constructor
		System.out.println("This is bank constructor");
		
	}
	private Bank(int rs) {
		System.out.println("This is private bank constructor"+rs);
	}
}

class Sbi extends Bank{
	

	@Override
	int getrateofintrest() {
		// TODO Auto-generated method stub
		return 45;
	}
	public Sbi() {
		super();//super constructor call parent constructor
		System.out.println("this is sbi construct");
	}
	
	
}

class yono extends Bank{

	@Override
	int getrateofintrest() {
		// TODO Auto-generated method stub
		return 35;
	}
	
}
public class Main {

	public static void main(String[] args) throws InsufficientFundsException, DivisionByZeroException {
		// TODO Auto-generated method stub
//		Bank sb=new Sbi();
//		System.out.println(sb.getrateofintrest());
//		Bank yn=new yono();
//		System.out.println(yn.getrateofintrest()); 
//		yn.run();
		
//		Sbi sbi=new Sbi();
		BankAccount bank=new BankAccount(600,300);
		bank.getWithdraw(400);
		
		Calculator cl=new Calculator();
		System.out.println(cl.divide(12, 34));
		
	}

}
