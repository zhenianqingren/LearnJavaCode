package test1;

public class Account {
	private int id;//账户
	private double balance;//余额
	private double annualRate;//年利率
	
	public Account() {System.out.println("New Account");}
	public Account(int id,double balance,double annualRate)
	{
		this.id=id;
		this.balance=balance;
		this.annualRate=annualRate;
	}
	
	public int getId() {return this.id;}
	public void setId(int id) {this.id=id;}
	public double getbalance() {return balance;}
	public void setbalance(double balance) {this.balance=balance;}
	public double getannualRate() {return this.annualRate;}
	public void setannaulRate(double annualRate) {this.annualRate=annualRate;}
	
	public void withdraw(double amount)
	{
		if(amount>balance)System.out.println("Error");
		balance-=amount;
		System.out.println("Success: "+amount);
	}
	public void deposit(double amount)
	{
		if(amount>0)
		{
			balance+=amount;
			System.out.println("Success: "+amount);
		}
	}
}
