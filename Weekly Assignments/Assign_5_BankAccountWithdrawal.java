package weekly_assignments;

class BankAccount
{
	String AccountHolder;
	Double Balance;
	
	BankAccount(String AccountHolder, Double Balance)
	{
	this.AccountHolder=AccountHolder;
	this.Balance=Balance;
	}
	
void withdraw(double amount)
{
	try
	{
		System.out.println("Account Holder:"+AccountHolder);
		System.out.println("Current Balance:"+Balance);
		System.out.println("Withdrawal Amount:"+amount);
		
		if(amount<0)
		{
			throw new Exception("Invalid Amount");
		}
		
		if(amount>Balance)
		{
			throw new ArithmeticException("Insufficient Transaction");
		}
		
		Balance=Balance-amount;
		System.out.println("Remaining Amount:"+Balance);
	}
	catch(ArithmeticException ex)
	{
		System.out.println(ex.getMessage());
	}
	catch(Exception ex)
	{
		System.out.println(ex.getMessage());
	}
	finally
	{
		System.out.println("Transiction Completed");
	}
}
	
}
public class Assign_5_BankAccountWithdrawal {
	
	public static void main(String[] args) 
	{
		BankAccount account = new BankAccount("Rakesh",10000.00);
		account.withdraw(5000);
		System.out.println();
		account.withdraw(15000);
		System.out.println();
		account.withdraw(-1000);

	}

}
