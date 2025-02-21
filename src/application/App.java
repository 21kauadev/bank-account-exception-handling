package application;

import java.util.Scanner;

import model.entities.Account;
import model.exceptions.ExceedsWithdrawException;
import model.exceptions.NotEnoughBalanceException;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter account data");

            System.out.print("Number: ");
            int number = sc.nextInt();

            System.out.print("Holder: ");
            sc.nextLine();
            String holder = sc.nextLine();

            System.out.print("Initial balance: ");
            double balance = sc.nextDouble();

            System.out.print("Withdraw limit: ");
            double withdrawLimit = sc.nextDouble();

            Account acc = new Account(number, holder, balance, withdrawLimit);

            System.out.println();

            System.out.print("Enter amount for withdraw: ");
            acc.withdraw(sc.nextDouble());

            System.out.printf("New balance: %.2f", acc.getBalance());
        } catch (ExceedsWithdrawException e) {
            System.out.println("Withdraw error: " + e.getMessage());
        } catch (NotEnoughBalanceException e) {
            System.out.println("Withdraw error: " + e.getMessage());
        }

        sc.close();
    }
}
