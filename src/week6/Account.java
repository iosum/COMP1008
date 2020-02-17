package week6;

public abstract class Account {
    private String AccountName;
    private double balance;
    public abstract double withdraw(double amount);
    public abstract double deposit(double amount);
}
