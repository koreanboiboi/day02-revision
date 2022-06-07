package workshop;

import java.util.LinkedList;
import java.util.List;
import java.util.UUID;


public class BankAccount {

    private String name = "";
    private String acctID = UUID.randomUUID().toString().substring(0,8);
    private float balance = 0f;
    private List<String> transaction = new LinkedList<>();
    private float w = 0f;   
    private float d= 0f;


    public BankAccount(String name){
        this.name=name;
    }

    public BankAccount(String name, float initialBal){
        this.name=name;
        this.balance=initialBal;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAcctID() {
        return acctID;
    }
    
    public float getBalance() {
        return balance +d-w;
    }
    public void setBalance(float balance) {
        this.balance = balance;
    }
    public List<String> getTransaction() {
        return transaction;
    }
    public void setTransaction(List<String> transaction) {
        this.transaction = transaction;
    }

    public void deposit(float d) {

        this.d = d;
    }
    public void withdraw(float w) {
        this.w = w;
        
    }



    
    
    
    
}
