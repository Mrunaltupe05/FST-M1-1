import org.junit.jupiter.api.Test;
import Activity.JActivity2BankAccount;
import Activity.NotEnoughFundsException;
import static org.junit.jupiter.api.Assertions.*;
public class JAct2ExpectedException {
    @Test
    void notEnoughFunds() {

        JActivity2BankAccount account = new JActivity2BankAccount(100);

        assertThrows(NotEnoughFundsException.class, () -> account.withdraw(200),
                "Balance must be greater than amount of withdrawal");
    }

    @Test
    void enoughFunds() {

        JActivity2BankAccount account = new JActivity2BankAccount(1000);

        assertDoesNotThrow(() -> account.withdraw(500));
    }
}
