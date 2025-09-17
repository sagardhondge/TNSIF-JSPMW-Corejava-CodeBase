package Transaction;
import java.util.Scanner;

public class Transactions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose Transaction Mode");
        System.out.println("1) Net Banking");
        System.out.println("2) UPI");
        System.out.println("3) Demand Draft");
        System.out.println("4) Cheque");
        System.out.println("5) Cash");

        System.out.print("Enter your choice (1-5): ");
        int choice = sc.nextInt();
        sc.nextLine(); // consume leftover newline

        MoneyWithdrawMethods transaction = null;

        if (choice == 1) {
            transaction = new NetBanking();
        } else if (choice == 2) {
            transaction = new UPI();
        } else if (choice == 3) {
            transaction = new DD();
        } else if (choice == 4) {
            transaction = new Cheque();
        } else if (choice == 5) {
            transaction = new CashAmount();
        } else {
            System.out.println("Invalid choice!");
            sc.close();
            return;
        }

        transaction.processTransaction();
        sc.close();
    }
}
