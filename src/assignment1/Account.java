package assignment1;

public class Account {
    /**
     * Declare 3 instance variables
     */
    private String firstName;
    private String lastName;
    private double balance;

    /**
     * Initialize the person's first name, last name and the balance
     *
     * @param firstName
     * @param lastName
     * @param balance
     */
    public Account(String firstName, String lastName, double balance) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = balance;
    }

    public String getFirstName() {
        return firstName;
    }

    /**
     * this method will validate if first name only contains letters
     *
     * @param firstName
     */
    public void setFirstName(String firstName) {
        char[] charArray = firstName.toCharArray();
        for (char c : charArray) {
            if (!Character.isLetter(c)) {
                throw new IllegalArgumentException("Invalid character in the first name");
            }
        }
        this.firstName = firstName;

    }

    public String getLastName() {
        return lastName;
    }

    /**
     * this method will validate if last name only contains letters
     *
     * @param lastName
     */
    public void setLastName(String lastName) {
        char[] charArray = lastName.toCharArray();
        for (char c : charArray) {
            if (!Character.isLetter(c)) {
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

    /**
     * this method will validate the money and return the balance after depositing
     *
     * @param amount
     */
    public double deposit(double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Cannot deposit a negative number");
        }
        balance += amount;
        return balance;
    }

    /**
     * this method will validate the amount of withdrawal and calculate the balance after withdrawing
     *
     * @param amount
     */
    public double withdraw(double amount) {
        if (balance < amount) {
            throw new IllegalArgumentException("Not Sufficient Funds to withdraw");
        }
        if (amount < 0.0) {
            throw new IllegalArgumentException("Cannot withdraw a negative amount");
        }
        balance -= amount;
        return balance;
    }

    /**
     * this method will format personal information
     *
     * @return
     */
    @Override
    public String toString() {
        return String.format("FirstName:%s LastName:%s Balance:%.1f", getFirstName(), getLastName(), getBalance());
    }
}
