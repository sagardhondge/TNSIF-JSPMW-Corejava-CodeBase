package Transaction;
import java.util.Scanner;
public class CashAmount {
    @Override
    public void processTransaction() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Cash Amount: ");
        double amount = sc.nextDouble();
        System.out.println("Transaction successful. Cash Received: ₹" + amount);
    }
}
