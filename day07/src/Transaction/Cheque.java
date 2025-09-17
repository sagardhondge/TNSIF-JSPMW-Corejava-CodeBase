package Transaction;

import java.util.Scanner;

public class Cheque extends MoneyWithdrawMethods {

    @Override
    public void processTransaction() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Cheque Number: ");
        String chequeNumber = sc.nextLine();
        System.out.println("Transaction successful via Cheque. Cheque No: " + chequeNumber);
    }
}
