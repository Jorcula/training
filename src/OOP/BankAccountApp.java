package OOP;

public class BankAccountApp {

	public static void main(String[] args) {

		
		BankAccount acc1 = new BankAccount();
		
		BankAccount acc2 = new BankAccount("account typeee");
		 acc1.setName("Roger");
		 
		 System.out.println(acc1.getName());

		CDaccount cd1 = new CDaccount();
		cd1.compount();

	}

}
