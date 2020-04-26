package OOP;

/* Create a Student Database with the following attributes:
 New Student constructor that takes name and SSN in the arguments
 Automatically create an email ID based on the name
 Set a private static ID
 Generate a user ID that is combination of Static ID, random 4-digit number between 1000
and 9000, and last 4 of SSN
 Methods: enroll(), pay(), checkBalance(), toString(), showCourses()
 Use encapsulation to set variables (phone, city, state) */


public class Student implements IStudent {
	
	public static void main(String[] args) {
		
		Student student1 = new Student("Jovana", "010102023");
		Student student2 = new Student("Juan", "78388383");
		Student student3 = new Student("Diego", "90101001");
		Student student4 = new Student("SpongeBob", "77777777");


	}
	
	private String name;
	private String SSN;
	private static int staticID = 1000;
	private String phone;
	private String city;
	private String state;
	private String email;
	private String userID;
	private int deposit;
	private int balance = 0;
	
	
	Student(String name, String SSN) {
		setName(name);
		setEmail(name);
		setUserID(SSN);
		staticID++;
		
		System.out.println("New student created!");

		System.out.println("Your email is: " + getEmail());
		
		System.out.println("Your static ID is: " + staticID);
		
		System.out.println("Your user ID is: " + getUserID());
		
		enroll("Jovana", "132432435", "021882972", "Karlovci", "Srbija");
		pay(1500);
		pay(3456);
		checkBalance();
		showCourses();
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setEmail (String name) {
		email = name + "@yahoo.com";
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public void setUserID (String SSN) {
		int random = (int)(Math.random() * 10000);
		String lastNumbers = SSN.substring((SSN.length())-4);
		userID = staticID + "" + random+ lastNumbers;
	}
	
	public String getUserID() {
		return this.userID;
	}
	
	public void setSSN (String SSN) {
		this.SSN = SSN;
	}
	
	public String getSSN() {
		return this.SSN;
	}
	
	public void setPhone (String phone) {
		this.phone = phone;
	}
	
	public String getPhone () {
		return this.phone;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getCity() {
		return this.city;
	}
	
	public void setState(String state) {
		this.state = state;
	}
	
	public String getState() {
		return this.state;
	}
	
	
	@Override
	public void enroll(String name, String SSN, String phone, String city, String state) {
		setName(name);
		setSSN(SSN);
		setPhone(phone);
		setCity(city);
		setState(state);
		
		System.out.println("You have enrolled X University. ");
		System.out.println(toString());
	}

	@Override
	public void pay(int deposit) {
		balance = balance + deposit;
		System.out.println("You have paid $" + deposit + " towards your scholarship.");
	}

	@Override
	public void checkBalance() {
		System.out.println("Your current balance is: " + balance);
	}

	@Override
	public void showCourses() {
		System.out.println("The available courses are: \n 1. Math \n 2. Geography \n 3. Diplomacy");
	}
	
	@Override
	public String toString() {
		return "Student name : " + name + "\n SSN : " + SSN + " \n Phone: " + phone + " \n  City: " + city + "\n State: " + state; 
		
	}
}
