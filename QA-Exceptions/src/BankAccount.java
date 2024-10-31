public class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "balance=" + balance +
                '}';
    }

    public void withdraw(double num1) throws InsufficientFundsException {
        if (this.balance < num1){
            throw new InsufficientFundsException("Insufficient funds");
        }
        else {
            this.balance = this.balance - num1;
            System.out.println("Balance is now: " + this.balance);
        }
    }
}
