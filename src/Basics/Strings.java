package Basics;

public class Strings {

	public static void main(String[] args) {
		
		String bookTitle;
		String wordChoice = "Aska";
		bookTitle = "Harry Potter and the prisoner of Askaban";
		
		if (bookTitle.contains(wordChoice)) {
			System.out.println("The book contains the word 'Aska'.");
		}

		String browser = "Chrome";
		
		if (browser.equalsIgnoreCase("Chrome")) {
			System.out.println("The browser is Chrome.");
		}
		
		String firstName = "Jovana";
		String lastname = "Jerkov";
		String digit = "3004991";
		
		System.out.print(firstName.substring(0, 1));
		System.out.println(lastname.substring(0, 1));
		System.out.println(digit.substring(5));

		System.out.println("There are " + digit.length() + " in digits.");
		
	}

}
