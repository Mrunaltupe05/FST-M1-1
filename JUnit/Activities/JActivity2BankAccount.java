package Activity;


public class JActivity2BankAccount{
    private Integer balance;

    public JActivity2BankAccount(Integer initialBalance) {
        balance = initialBalance;
    }

    public Integer withdraw(Integer amount) {
        if (balance < amount) {
            throw new NotEnoughFundsException(amount, balance);
        }
        balance -= amount;
        return balance;
    }
}