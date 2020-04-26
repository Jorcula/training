package OOP;

public class BankAccount implements IRate {
	
	String accountNumner;
	private static final String roundingNumber = "1234";
	private String name;
	String SSN;
	String accountType;
	
	
	BankAccount(){
		System.out.println("NEW BANK ACCOUNT IS CREATED!");
	}
	
	BankAccount(String accountType){
		System.out.println("New bank account " + accountType);
	}
	
	void deposit() {
		
	}
	
	void withdraw() {
		
	}
	
	void checkBalance() {
		
	}
	
	void getStatus() {
		
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	public void setRate() {
		
	}
	
	public void increaseRate() {
		
	}

}
