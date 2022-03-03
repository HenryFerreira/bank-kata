package amount;

import account.Constant;
import dateFormat.Date;

public class Transaction {
    Long transactionId;
    Constant transactionType;
    int amount;
    int balance;
    Date date;

    public Transaction(Constant transactionType, int amount, int balance, Date date) {
        this.transactionType = transactionType;
        this.amount = amount;
        this.balance = balance;
        this.date = date;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "transactionId=" + transactionId +
                ", transactionType=" + transactionType +
                ", amount=" + amount +
                ", balance=" + balance +
                ", date=" + date +
                '}';
    }
}
