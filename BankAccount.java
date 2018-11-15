//package is collection of logical classes


public class BankAccount {
	
	//static variable
	private static int autoAccountNo;
	
	//instance variable /class variable 
	private int accountNo;
	private String accountHolderName;
	private double accountBalance;
	
	//we cannot access instance variable if objects are not created 
	
	//init block
	{
		//System.out.println("init block");
		accountNo = ++autoAccountNo;

	}
	
	//default constructor
	public BankAccount() {
		//accountNo = ++autoAccountNo;
		accountHolderName="Unknow";
		accountBalance=0;
		//System.out.println("default constructor");
		//WE use constructor to initialize class objects
		//to automatically call objects
	}
	
	//parameterize constructor
	public BankAccount(String accountHolderName, double accountBalance) {
		//accountNo = ++autoAccountNo;
		this.accountHolderName=accountHolderName;
		this.accountBalance=accountBalance;
		//System.out.println("parameterized Constructor");
		//constructor overloading
	}
	// init block to define common  variable of above two constructor
	//reduce reduncy 
	
	
	//setter method   modifieding or reinitializing  member variables
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	
	public static void main(String[] args) {
		BankAccount acc = new BankAccount();
		BankAccount acc2 = new BankAccount("onkar",5000);
		 
	 }
	// static var aleays get loaded before method called
	//it get shared by classes im method memory
	// static make account no shared not a unique
	
	//how we can initialze after creation/modified / updated
	//conceptual method

}