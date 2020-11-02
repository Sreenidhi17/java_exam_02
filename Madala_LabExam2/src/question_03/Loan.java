/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question_03;

/**
 *
 * @author S541226
 */
public class Loan {

    private long accountNumber;
    private double balance;
    private double amount;
    private final double INTEREST_RATE = 5.80;

    /**
     * constructor for a loan object
     *
     * @param accountNumber
     * @param balance
     * @param amount
     */
    public Loan(long accountNumber, double balance, double amount) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.amount = amount;
    }

    /**
     * prints the loan object info
     *
     * @return string
     */
    @Override
    public String toString() {
        return "This is from Loan object" + "\n" + "\t" + "accountNumber="
                + accountNumber + "\t" + "balance="
                + balance + "\t" + "amount=" + amount + "\t"
                + "INTEREST_RATE=" + INTEREST_RATE;
    }
}
