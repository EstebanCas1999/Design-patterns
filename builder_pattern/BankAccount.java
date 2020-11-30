package builder_pattern;

public class BankAccount {

    public static class Builder {


        private long accountNumber;
        private String owner;
        private String branch;
        private double balance;
        private double interestRate;

        public Builder(long accountNumber) {

            this.accountNumber = accountNumber;

        }

        public Builder withOwner(String owner){

            this.owner = owner;
            return this;
        }

        public Builder atBranch(String branch){
            this.branch = branch;
            return this;
        }

        public Builder openingBalance(double balance){

            this.balance = balance;
            return this;
        }

        public Builder atRate(double interestRate){
            this.interestRate = interestRate;
            return this;
        }

        public BankAccount build(){
            BankAccount account = new BankAccount();
            return account;
        }
    }

    private BankAccount() {}
}