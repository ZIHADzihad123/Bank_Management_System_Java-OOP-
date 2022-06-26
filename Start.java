import java.lang.*;

public class Start
{
	public static void main(String args[])
	{
		Account sa1 = new Account();
		sa1.setAccountNumber(1111);
		sa1.setBalance(500);
		
		Account sa2 = new Account();
		sa2.setAccountNumber(2111);
		sa2.setBalance(5000);
		
		
		Account sa3 = new Account();
		sa3.setAccountNumber(3111);
		sa3.setBalance(3300);
		
		
		Account sa4 = new Account();
		sa4.setAccountNumber(4111);
		sa4.setBalance(4000);
		
		
		
		
		Customer c1 = new Customer();
		c1.setName("ABCD");
		c1.setNid(11223344);
		
		c1.insertAccount(sa1);
		c1.insertAccount(sa2);
		
		
		Customer c2 = new Customer();
		c2.setName("MNOP");
		c2.setNid(11332244);
		
		
		c2.insertAccount(sa3);
		
		Customer c3 = new Customer();
		c3.setName("XYZ");
		c3.setNid(11003344);
		
		c3.insertAccount(sa4);
		
		
		Employee e1 = new Employee();
		e1.setEmpId("1-2-3");
		e1.setName("ASD");
		e1.setSalary(200.5);
		
		Employee e2 = new Employee();
		e2.setEmpId("1-2-4");
		e2.setName("QWE");
		e2.setSalary(2222.5);
		
		Bank b = new Bank();
		
		
		b.insertCustomer(c1);
		b.insertCustomer(c2);
		b.insertCustomer(c3);
		
		b.insertEmployee(e1);
		b.insertEmployee(e2);

		
		b.showAllCustomers();
		b.showAllEmployees();
	}
}
