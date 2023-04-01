package bankmodel;

import java.util.Scanner;

public class Bank {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		BankOperations bo = new BankOperations();

		int choice = 0;
		while (choice != 6) {
			System.out.println("\n Banking System Application");
			System.out.println(
					"1.enter your account detail  \n 2. Display all account details\n 3.search the account  \n 4. Withdraw the amount \n 5.Deposit the amount \n 6.Exit ");
			System.out.println("Enter your choice: ");
			choice = sc.nextInt();
			switch (choice) {
			case 1: {

				System.out.println("enter your account details");

				bo.AccountCreation();

				break;
			}
			case 2: {

				bo.showAccount();
				break;
			}

			case 3: {

				System.out.print("Enter account no. you want to search: ");
				String ac_no = sc.next();
				boolean found = false;

				found = bo.search(ac_no);
				if (found) {
					break;
				}

				if (!found) {
					System.out.println("Search failed! Account doesn't exist..!!");

				}
				break;
			}
			case 4: {

				System.out.println(" enter the amount you want to take out");
				int withdrawal = sc.nextInt();
				bo.withdrawalAccount(withdrawal);
				break;

			}

			case 5: {

				System.out.println("enter the deposite amount");
				int deposite = sc.nextInt();
				bo.depositeAccount(deposite);
				break;

			}

			case 6: {
				System.out.println("Thanku for visit this bank ");
			}

			}
		}
	}
}
