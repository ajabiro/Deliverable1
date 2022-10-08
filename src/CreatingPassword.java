import java.util.Scanner;
public class CreatingPassword {
	
	public static void main(String[] args) {
		System.out.println("Please creae a password that contains at least 1 uppercase letter, 1 lowercase "
				+"letter, one exclamation point, and is between 7 and 12 characters in length.");
		
		boolean length = false;
		boolean exclamation = false;
		boolean uppercase = false;
		boolean lowercase = false;
		
		
		
		Scanner scnr = new Scanner (System.in);
		System.out.print("Enter password: ");
		String password = scnr.nextLine();
		String st = "!";
		
		for(int i=0; i<password.length(); i++) {
			if(Character.isUpperCase(password.charAt(i))) {
				uppercase = true;
			}
			
		for (int j=0; j<password.length(); j++) {
			if(Character.isLowerCase(password.charAt(j))) {
				lowercase = true;
			}
			
			if ((password.length() >= 7)  && (password.length() <= 12)) {
				length = true;
			}
			if (password.contains(st)) {
				exclamation = true;
			}
		}	
	}
	if ((length == true) && (exclamation == true) && (uppercase == true) && (lowercase == true )) {
		System.out.println("Password valid and accepted"); }
	else {
		System.out.println("Error");
		
		}
	}
}