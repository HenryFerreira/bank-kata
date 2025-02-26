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

    public String showTransaction(){
        if(this.transactionType == Constant.DEPOSIT){
            String body = "|" + this.date.getDateString() + "|" + this.amount + "|\t|" + this.balance + "|";
            return body;
        }
        String body = "|" + this.date.getDateString() + "|\t|" + this.amount + "|" +this.balance + "|";
        return body;
    }
}
