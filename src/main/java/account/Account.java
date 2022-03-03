package account;

import amount.Amount;
import amount.Transaction;
import amount.TransactionList;
import dateFormat.Date;

import java.util.List;

public class Account {
    private Long accountId;
    private Amount amount;
    private TransactionList transactionList;


    public Account(Long accountId, Amount amount, TransactionList transactionList) {
        this.accountId = accountId;
        this.amount = amount;
        this.transactionList = transactionList;
    }

    public void deposit(int amount, Date date) {
        System.out.println("aca");
        int balance = this.amount.getAmount() + amount;
        Transaction transaction = new Transaction(Constant.DEPOSIT, amount, balance, date);
        this.transactionList.addTransaction(transaction);
        this.amount.addAmount(amount);
    }

    public void withdraw(int amount, Date date) {
        int balance = this.amount.getAmount() - amount;
        Transaction transaction = new Transaction(Constant.WITHDRAW, amount, balance, date);
        this.transactionList.addTransaction(transaction);
        this.amount.reduceAmount(amount);
    }

    public void printStatements() {
        List<Transaction> list = this.transactionList.getTransactionList();
        System.out.println("Transacciones: ");
        for (Transaction element : list) {
            System.out.println(element.toString());
        }
    }

}
