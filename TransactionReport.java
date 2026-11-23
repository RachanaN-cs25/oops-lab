
package reports;

import transaction.Account;

public class TransactionReport {

    public void generateReport(Account a) {
        System.out.println("\nTRANSACTION REPORT");
        System.out.println("Account Number: " + a.getAccountNumber());
        System.out.println("Available Balance: " + a.getBalance());
        System.out.println(" ");
    }
}
