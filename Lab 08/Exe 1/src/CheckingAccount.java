public class CheckingAccount extends BankAccount {
    private double interestRate;

    // Constructor with interest rate for checking account
    public CheckingAccount(double interestRate) {
        this.interestRate = interestRate;
    }

    // Implementation of the abstract method to calculate interest for checking account
    @Override
    public double calculateInterest() {
        return getBalance() * (interestRate / 100.0);
    }
}
