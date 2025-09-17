package Transaction;
import java.util.Scanner;

public class UPI extends MoneyWithdrawMethods {
    @Override
    public void processTransaction() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter UPI ID: ");
        String upiId = sc.nextLine();
        System.out.print("Enter UPI PIN: ");
        int upiPin = sc.nextInt();
        System.out.println("Transaction successful via UPI with ID: " + upiId);
    }
}
