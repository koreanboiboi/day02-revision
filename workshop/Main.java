package workshop;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    

    public static void main(String[] args) {

    
        BankAccount acct = new BankAccount("Fred");
        System.out.printf("name: %s\n", acct.getName());
        System.out.printf("acctId: %s\n", acct.getAcctID());
        System.out.printf("balance: %.2f\n", acct.getBalance());
        System.out.println();

        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
        Date date = new Date();
        acct.deposit(5000);
        System.out.printf("$%.2f depositted on ",acct.getBalance());
        System.out.println(formatter.format(date));
        System.out.printf("balance after transaction: %.2f ", acct.getBalance());
        System.out.println(formatter.format(date));
        acct.withdraw(3503);
        System.out.printf("balance after transaction: %.2f ", acct.getBalance());
        System.out.println(formatter.format(date));

        
         
    }
    
}
