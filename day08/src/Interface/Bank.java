package Interface;

public interface Bank {
    float Deposit_Limit = 50000f;
    float MINIBAL = 1000f;

    void deposit(float amount);
    void withdraw(float amount);
}
