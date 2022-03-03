package amount;

import java.util.List;

public class TransactionList {
    Long TransactionListId;
    List<Transaction> transactionList;

    public TransactionList(List<Transaction> transactionList) {
        this.transactionList = transactionList;
    }

    public Long getTransactionListId() {
        return TransactionListId;
    }

    public void setTransactionListId(Long transactionListId) {
        TransactionListId = transactionListId;
    }

    public List<Transaction> getTransactionList() {
        return transactionList;
    }

    public void setTransactionList(List<Transaction> transactionList) {
        this.transactionList = transactionList;
    }
}
