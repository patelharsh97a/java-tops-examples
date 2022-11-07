import java.util.Scanner;

public class BankDemo {

	public static void main(String[] args) {
		CheckingAccount c=new CheckingAccount(101, 1000);
		double amount;
		while(true) {
			System.out.println("***************************");
			System.out.println("1. Deposit");
			System.out.println("2. Withdraw");
			System.out.println("3. Check Balance");
			System.out.println("4. Exit");
			System.out.println("***************************");
			
			Scanner sc=new Scanner(System.in);
			System.out.print("Enter Your Choice : ");
			int choice=sc.nextInt();
			System.out.println("***************************");
			if(choice==1)
			{
				System.out.print("Enter Deposit Amount : ");
				amount=sc.nextDouble();
				c.deposit(amount);
				System.out.println("***************************");
			}
			else if(choice==2)
			{
				System.out.println("Enter Withdraw Amount : ");
				amount=sc.nextDouble();
				try {
					c.withdraw(amount);
					System.out.println("***************************");
				}catch(InSufficientFund e) {
					System.out.println("Sorry You Need Another "+e.getAmount()+" Rs.");
					System.out.println("***************************");
				}
			}
			else if(choice==3) {
				c.checkBalance();
				System.out.println("***************************");
			}
			else if(choice==4)
			{
				break;
			}
		}
	}
}
