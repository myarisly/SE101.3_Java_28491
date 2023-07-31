public class Main {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount(12);
        CheckingAccount checkingAccount = new CheckingAccount(2);

        // Set balances for the accounts
        savingsAccount.setBalance(20000000); // 20 million
        checkingAccount.setBalance(1000000); // 1 million

        // Calculate and print interest for both accounts
        double savingsInterest = savingsAccount.calculateInterest();
        double checkingInterest = checkingAccount.calculateInterest();

        System.out.println("Interest for Savings Account: " + savingsInterest);
        System.out.println("Interest for Checking Account: " + checkingInterest);
    }
}
