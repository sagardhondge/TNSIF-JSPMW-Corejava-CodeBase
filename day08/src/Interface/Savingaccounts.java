package Interface;

public class Savingaccounts extends Customer implements Bank {

    private int accNo;
    private float balance;

    public Savingaccounts(String name, String city, int accNo, float balance) {
        super(name, city);
        this.accNo = accNo;
        this.balance = balance;
    }

    public int getAccNo() {
        return accNo;
    }

    public void setAccNo(int accNo) {
        this.accNo = accNo;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    @Override
    public void deposit(float amount) {
        if (amount <= 0 || amount > Deposit_Limit) {
            System.out.println("Invalid deposit amount!");
        } else {
            balance += amount;
            System.out.println("Rs " + amount + " deposited successfully");
        }
    }

    @Override
    public void withdraw(float amount) {
        if (balance - amount >= MINIBAL) {
            balance -= amount;
            System.out.println("Rs " + amount + " withdrawn successfully");
        } else {
            System.out.println("Insufficient Balance! Minimum balance required: " + MINIBAL);
        }
    }

    @Override
    public String toString() {
        return "SavingAccount [Name=" + getName() + ", City=" + getCity() +
               ", Account No=" + accNo + ", Balance=" + balance + "]";
    }
}
