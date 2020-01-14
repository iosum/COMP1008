package assignment1;

public class Account {
    private String firstName;
    private String lastName;
    private double balance;

    public Account(String firstName, String lastName, double balance) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = balance;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        char[] charArray = firstName.toCharArray();
        for(char c: charArray) {
            if(!Character.isLetter(c)) {
                throw new IllegalArgumentException("Invalid character in the first name");
            }
        }
        this.firstName = firstName;

    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        char[] charArray = lastName.toCharArray();
        for(char c: charArray) {
            if(!Character.isLetter(c)) {
                throw new IllegalArgumentException("Invalid character in the last name");
            }
        }
        this.lastName = lastName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double deposit(double amount) {
        if(amount < 0) {
            throw new IllegalArgumentException("Cannot deposit a negative number");
        }
        balance += amount;
        return balance;
    }

    public double withdraw(double amount) {
        if(balance < amount) {
            throw new IllegalArgumentException("Not Sufficient Funds to withdraw");
        }
        if(amount < 0.0) {
            throw new IllegalArgumentException("Cannot withdraw a negative amount");
        }
        balance -= amount;
        return balance;
    }

    public String toString() {
        return String.format("FirstName:%s LastName:%s Balance:%.1f", firstName, lastName, balance);
    }
}
