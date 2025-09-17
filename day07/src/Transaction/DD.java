package Transaction;
import java.util.Scanner;

public class DD extends MoneyWithdrawMethods {

    @Override
    public void processTransaction() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter DD Number: ");
        String ddNumber = sc.nextLine();
        System.out.println("Transaction successful via Demand Draft. DD No: " + ddNumber);
    }
}