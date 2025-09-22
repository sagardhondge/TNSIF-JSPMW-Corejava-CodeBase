package Interface;

public class BankDemo {
    public static void main(String[] args) {
        Savingaccounts s1 = new Savingaccounts("Sagar", "Pune", 1234, 5000);

        s1.deposit(20000);
        System.out.println(s1);

        s1.withdraw(15000);
        System.out.println(s1);

        s1.withdraw(10000); 
    }
}
