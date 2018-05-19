
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class AtmApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
	NumberFormat money = NumberFormat.getCurrencyInstance(Locale.US);
		
		
		Atm myAtm = new Atm(100);
		System.out.println("Enter your PIN");
		String enteredPin = input.nextLine();

		while (!enteredPin.equals(myAtm.getRequiredPin())) {
			System.out.println("Pins do not match try again");
			enteredPin = input.nextLine();
		}
		String choice;
		do {
			System.out.println("Welcome to Bank of We Can Code IT");
			System.out.println("Choose an option");
			System.out.println("Press 1 for deposit");
			System.out.println("Press 2 for withdraw");
			System.out.println("Press 3 for check balance");
			System.out.println("Press 4 to exit");
			choice =input.nextLine();	
        
			
			 System.out.println("How much would you like to deposit?");
	        int amount = input.nextInt();
	        myAtm.deposit(amount);
	        input.nextLine();
	        
			} else if(choice.equals("2")) {
				System.out.println("Please withdraw multiples of 10");
				int amount = input.nextInt();
				System.out.println("You chose to withdraw " + money.format(amount));
				myAtm.withdraw(amount);
				input.nextLine();
			
			} else if (choice.equals("3")) {
				System.out.println("Your current balance is " + money.format(myAtm.getBalance()));
				
			} else {
            System.out.println("Thanks for banking with us again today....godbye!");
			System.exit(0);		
		
			}while(!choice.equals("4"));
}}