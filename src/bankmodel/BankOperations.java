package bankmodel;

import java.util.Scanner;

public class BankOperations {

	private static String accno;
	private static String name;
	private static String acctype;
	static int total;
	static Scanner sc = new Scanner(System.in);

	public static void AccountCreation() {

		System.out.print("Enter Account No: ");
		accno = sc.next();
		System.out.print("Enter Account type: ");
		acctype = sc.next();
		System.out.print("Enter Name: ");
		name = sc.next();
		System.out.print("Enter Balance: ");
		total = sc.nextInt();

	}

	public void showAccount() {
		
		System.out.println("Name of account holder: " + name);
		System.out.println("Account no.: " + accno);
		System.out.println("Account type: " + acctype);
		System.out.println("Balance: " + total);
	}

	public static void withdrawalAccount(int withdrawal) {

		if (total >= withdrawal) {
			System.out.println(" you can take out the amount from -->" + total);
			total = total - withdrawal;
			System.out.println(" the available balance is -" + total);
			System.out.println("and the  withdrawal amount is " + withdrawal);
		} else {
			System.out.println(" you can not withdraw " + withdrawal);

			System.out.println("your balance is: " + total);
		}
	}

	public static void depositeAccount(int deposite) {

		total = total + deposite;
		System.out.println(" the Available balance is " + total);
		System.out.println("and the deposite amount is " + deposite);
	}
   
	public boolean search(String ac_no) {  
        if (accno.equals(ac_no)) {  
            showAccount();  
            return (true);  
        }  
        return (false);  
    }  
}  
	

