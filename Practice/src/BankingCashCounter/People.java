package BankingCashCounter;

public class People {
	private double cash=0;
	public void deposit(double credit)
	{
		cash =cash+credit;
		System.out.println("Cash in your account balance"+cash);
	
	}
	public void withdraw(double debit)
	{
		if(cash<100)
		{
			System.out.println("Insufficient Fund");
			return;
			
		}
		else if(cash<debit)
		{
			System.out.println("Sorry! you dont have enough balance");
			System.out.println("Remaining balance"+cash);
			return;
		}
		cash=cash-debit;
		System.out.println("Remaining balance"+cash);
	
	}
	public double Balance(){
		return cash;
	}
}
