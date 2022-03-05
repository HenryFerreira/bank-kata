package amount;

import java.util.ArrayList;
import java.util.List;

public class TransactionList {
    Long TransactionListId;
    List<Transaction> transactionList;

    public TransactionList() {
        this.transactionList = new ArrayList<>();
    }

    public TransactionList(List<Transaction> transactionList) {
        this.transactionList = transactionList;
    }

    public void addTransaction(Transaction transaction) {
        this.transactionList.add(transaction);
    }

    public List<Transaction> getTransactionList() {
        return transactionList;
    }
}
