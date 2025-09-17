package Transaction;
import java.util.Scanner;

public class NetBanking extends MoneyWithdrawMethods {
    @Override
    public void processTransaction() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Net Banking User ID: ");
        String userId = sc.nextLine();
        System.out.print("Enter Password: ");
        String password = sc.nextLine();
        System.out.println("Transaction successful via Net Banking for user: " + userId);
    }
}
