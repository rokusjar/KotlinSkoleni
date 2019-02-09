package basic.patterns;

public class BankAccount {
    private String accountNumber;
    private String owner;
    private double balance;
    private double interestRate;

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getOwner() {
        return owner;
    }

    public double getBalance() {
        return balance;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public static class Builder {
        private final String accountNumber;
        private String own;
        private double balance;
        private double interestRate;

        public Builder(String accountNumber) {
            this.accountNumber = accountNumber;
        }

        public Builder withOwner(String owner) {
            this.own = owner;
            return this;
        }

        public Builder openingBalance(double balance) {
            this.balance = balance;
            return this;
        }

        public Builder atRate(double interestRate) {
            this.interestRate = interestRate;
            return this;
        }

        public BankAccount build() {
            BankAccount account = new BankAccount();
            account.accountNumber = this.accountNumber;
            account.owner = this.own;
            account.balance = this.balance;
            account.interestRate = this.interestRate;
            return account;
        }
    }

    private BankAccount() {
    }
}
