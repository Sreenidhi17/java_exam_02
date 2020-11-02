/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question_04_01;

/**
 *
 * @author Sreenidhi Madala
 */
public class CalcuateBill extends Student {

    private double bill;

    /**
     * constructor for CalcuateBill
     *
     * @param name
     * @param address
     * @param number
     * @param bill
     */
    public CalcuateBill(String name, String address, int number, double bill) {
        super(name, address, number);
        setBill(bill);
    }

    /**
     * gets the bill
     *
     * @return bill
     */
    public double getBill() {
        return bill;
    }

    /**
     * sets the bill
     *
     * @param newBill
     */
    public void setBill(double newBill) {
        if (newBill >= 0.0) {
            bill = newBill;
        }
    }

    /**
     * computes the bill
     *
     * @return
     */
    public double computeBill() {
        System.out.println("Computing Bill for " + getName());
        return bill / 3;
    }

    /**
     * sends the mail to corresponding student
     */
    public void mailBill() {
        System.out.println("Within mailBill of Salary class ");
        System.out.println("Mailing check to " + getName()
                + " with salary " + bill);
    }

}
