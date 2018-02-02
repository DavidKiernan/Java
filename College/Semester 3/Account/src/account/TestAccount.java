package account;

import java.util.Scanner;

public class TestAccount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String name;
        double balance;
        int acctNum;
        Account acct = new Account();

        System.out.print("\nCreating new Account using Name \n ");
        System.out.print("Enter account holder's first name: ");
        name = input.next();
        acct = new Account(name);
        System.out.println("Account for " + name + ":");
        acct.print();

        System.out.print("\nCreating new Account using Name & Balance ");
        System.out.print("\nEnter initial balance: ");
        balance = input.nextDouble();
        acct = new Account(balance,name);
        System.out.println("Account for " + name + ":");
        acct.print();

        System.out.print("\nCreating new Account using Name, Balance, Account Number");
        System.out.print("\nEnter account number: ");
        acctNum = input.nextInt();
        acct = new Account(balance,name,acctNum);
        System.out.println("Account for " + name + ":");
        acct.print();

        System.out.print("\nDepositing 100 into account, balance is now ");
        acct.deposit(100);
        System.out.println(acct.getBalance());
        System.out.print("\nWithdrawing €25, balance is now ");
        acct.withdrawl(25);
        System.out.println(acct.getBalance());
        System.out.print("\nWithdrawing €25 with €2 fee, balance is now ");
        acct.withdrawl(25,2);
        System.out.println(acct.getBalance());

        System.out.println("\nBye!");
    }
    
}
