package chapter_3_Function.smallFunction;

public class GoodExample {

    // Good: Small, focused functions
    public void processTransaction(String transactionId) {
        if (validateTransaction(transactionId)) {
            updateAccount(transactionId);
            logTransaction(transactionId);
        }
    }

    public boolean validateTransaction(String transactionId) {
        // Validates the transaction
        return false;
    }

    public void updateAccount(String transactionId) {
        // Updates the account
    }

    public void logTransaction(String transactionId) {
        // Logs the transaction
    }
}
