import java.lang.*;

public interface ITransaction
{
	public abstract void withdraw(double amount);
	void deposit(double amount);
	void transfer(Account a, double amount);
}