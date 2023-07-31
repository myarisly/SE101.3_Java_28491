public class SavingsAccount extends BankAccount {
    private double interestRate;

    // Constructor with interest rate for savings account
    public SavingsAccount(double interestRate) {
        this.interestRate = interestRate;
    }

    // Implementation of the abstract method to calculate interest for savings account
    @Override
    public double calculateInterest() {
        return getBalance() * (interestRate / 100.0);
    }
}
