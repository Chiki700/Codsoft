package Scanner;
import java.util.Scanner;
class BankAccount {
	private double balance;
	public BankAccount(double Balance) {
		balance=Balance;
		
	}
	public double getBalance() {
		return balance;
	}
	public void deposit(double amount) {
		balance += amount;
		System.out.println("you deposited: "+amount);
		
	}
	public void withdraw(double amount) {
		if(amount <= balance) {
			balance -= amount;
			System.out.println("You withdraw: "+amount);
		}
		else {
			System.out.println("Insufficient balance");
		}
		
	}	
}
public class AtmMachine{
	public static void main(String[]args) {
		Scanner s=new Scanner(System.in);
		BankAccount account=new BankAccount(1000);
		while(true) {
			System.out.println("\nATM Menu:");
			System.out.println("1. check Balance");
			System.out.println("2. Deposit");
			System.out.println("3. Withdraw");
			System.out.println("4. Exit");
			System.out.println("Choose an option: ");
			int option=s.nextInt();
			switch(option) {
			case 1:System.out.println("Your current Balance is: "+account.getBalance());
			break;
			case 2:System.out.println("Enter deposit Amount:");
			double depositAmount=s.nextDouble();
			account.deposit(depositAmount);
			break;
			case 3:System.out.println("Enter Withdrawal Amount");
			double WithdrawAmount=s.nextDouble();
			account.withdraw(WithdrawAmount);
			break;
			case 4:System.out.println("Exit");
			return;
			default:System.out.println("Invalid option.");
			}
		}
	}
}




















