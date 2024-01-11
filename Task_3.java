package codesoft_project;

import java.util.*;

class ATM_machine {
    userBankAccount account;

    public ATM_machine(userBankAccount BankAccount) {
        account = BankAccount;
    }

    public void deposit(double amount) {
        account.amount += amount;
    }

    public boolean withdraw(double amount) {
        if (amount <= account.amount) {
            account.amount -= amount;
            return true;
        }
        return false;
    }

    public double checkBalance() {
        return account.amount;
    }
}

class userBankAccount {
    double amount;

    public userBankAccount(double initialBalance) {
        amount = initialBalance;
    }
}

public class Task_3 {
    public static void main(String[] args) {
        userBankAccount account = new userBankAccount(1000); // initial Balance
        ATM_machine ATM = new ATM_machine(account);

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Welcome to ATM");
            System.out.println("1.) Check Balance ");
            System.out.println("2.) Deposit  ");
            System.out.println("3.) withdraw  ");
            System.out.println("4.) Exit ");

            System.out.println("Select an option : ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Your Current Balance is Rs" + ATM.checkBalance());
                    break;
                case 2:
                    System.out.println("Enter the amount to deposit : ");
                    double deposit = sc.nextInt();
                    ATM.deposit(deposit);
                    System.out.println("Deposit successful.Your Balance is Rs" + ATM.checkBalance());
                    break;
                case 3:
                    System.out.println("Enter the amount to withdraw :");
                    double withdraw = sc.nextInt();
                    boolean status = ATM.withdraw(withdraw);
                    if (status) {
                        System.out.println("Withdraw successful.Your Balance is Rs" + ATM.checkBalance());
                    } else {
                        System.out.println("Insufficient Balance.");
                    }
                case 4:
                    System.out.println("Thank you to use this ATM");
                    System.exit(0);
                default:
                    System.out.println("Invalid option. Please select valid option.");
                    break;
            }
        }
    }
}
