import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Bank {
    private Map<String, Account> accounts;

    public Bank() {
        this.accounts = new HashMap<>();
    }

    public void addAccount(String accountNumber, String customerName, double balance) {
        Account account = new Account(accountNumber, customerName, balance);
        accounts.put(accountNumber, account);
    }

    public void displayAccountInfo(String accountNumber) {
        if (accounts.containsKey(accountNumber)) {
            Account account = accounts.get(accountNumber);
            System.out.println("Account Number: " + account.getAccountNumber());
            System.out.println("Customer Name: " + account.getCustomerName());
            System.out.println("Balance: $" + account.getBalance());
        } else {
            System.out.println("Account not found!");
        }
        #WEBHOOK JOB DEMO ON 15-OCT-2025
            public static void sampleMethod(int a, int b) throws ArithmeticException{
        System.out.println("Hello, this is sample method");
        int c = a/b; //  int c = 4/2 which gets calculated as 2 
       
   }
        #END OF WEBHOOK CODE
    }


