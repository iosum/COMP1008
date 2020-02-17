/**
 * Overriding the withdrawal and deposit methods
 * Withdrawal method should check the over draft active or not if yes then should check the balance with the withdrawal amount and then perform the withdrawal, if withdrawal request is within the balance simple withdrawal should be performed otherwise your method should check the over draft limit to perform the action of withdrawal by checking the requesting amount with the OD or OD plus balance.
 */


package Lab2;


import static Lab2.OVERDRAFTSTATUS.*;

public class ChequingAccount extends Account {

    /**
     * create 3 instance variables for Chequing Account
     */
    private double monthlyFee;
    private int overDraftLimit;
    private double overDraftFee;

    private OVERDRAFTSTATUS currentOverDraftState;


    /**
     * Initialize the person's first name, last name and the balance
     *
     * @param firstName
     * @param lastName
     * @param balance
     */
    public ChequingAccount(String firstName, String lastName, double balance, double monthlyFee,
                           double overDraftFee, int overDraftLimit,
                           OVERDRAFTSTATUS currentOverDraftState) {
        super(firstName, lastName, balance);
        setMonthlyFee(monthlyFee);
        setOverDraftLimit(overDraftLimit);
        setOverDraftFee(overDraftFee);
        setCurrentOverDraftState(currentOverDraftState);
    }

    public int getOverDraftLimit() {
        return overDraftLimit;
    }

    public void setOverDraftLimit(int overDraftLimit) {
        this.overDraftLimit = overDraftLimit;
    }

    public OVERDRAFTSTATUS getCurrentOverDraftState() {
        return currentOverDraftState;
    }

    public void setCurrentOverDraftState(OVERDRAFTSTATUS currentOverDraftState) {
        this.currentOverDraftState = currentOverDraftState;
    }


    public double getMonthlyFee() {
        return monthlyFee;
    }

    public void setMonthlyFee(double monthlyFee) {
        this.monthlyFee = monthlyFee;
    }


    public double getOverDraftFee() {
        return overDraftFee;
    }

    public void setOverDraftFee(double overDraftFee) {
        this.overDraftFee = overDraftFee;
    }

    @Override
    public double withdraw(double amount) {
        double bal = super.getBalance();
        // check the over draft active or not
        if (bal > amount) {
            super.withdraw(amount);
        }
        else if (amount + overDraftLimit < bal) {
            bal = bal - amount - overDraftLimit;
            return bal;

        }
        return 0;
    }
}
