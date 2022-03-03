import account.Account;
import amount.Amount;
import amount.TransactionList;
import dateFormat.Date;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

public class AcceptanceTest {
    public Scanner scanner = new Scanner(System.in);


    @Test
    public void shouldWhatever() {
        Amount initialAmount = new Amount(0);
        Account newAccount;


        System.out.print("Ingrese su monto inical: ");
        initialAmount.addAmount(scanner.nextInt());

        newAccount = new Account(1L, initialAmount, new TransactionList());

        newAccount.deposit(5000, new Date("03/04/2022"));

        newAccount.printStatements();



    }

}
