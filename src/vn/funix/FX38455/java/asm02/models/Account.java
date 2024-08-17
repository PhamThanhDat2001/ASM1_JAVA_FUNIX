package vn.funix.FX38455.java.asm02.models;

public class Account {
    private String accountNumber;
    private double balance;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {

        this.accountNumber = accountNumber;
    }

    public boolean isPremiumAccount() {
        return this.balance >= 10_000_000;
    }

    @Override
    public String toString() {
        return accountNumber + "|                      " + balance + 'đ';
    }
}
////////////////