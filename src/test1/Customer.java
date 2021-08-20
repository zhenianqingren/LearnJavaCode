package test1;


public class Customer {
	private String firstName;
	private String lastName;
	private Account account;
	
	public Customer() {System.out.println("New Customer");}
	public Customer(String f,String l) {firstName=f;lastName=l;}
	public Account getAccount() {return account;}
	public void setAccount(Account account) {this.account=account;}
	public String getfirstName() {return firstName;}
	public String getlastName() {return lastName;}
}
