/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question_03;

/**
 *
 * @author Sreenidhi Madala
 */
public class Circle {

    private double a;
    private double b;

    /**
     * constructor for a circle object
     *
     * @param a
     * @param b
     */
    public Circle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    /**
     * prints the circle object info
     *
     * @return String
     */
    @Override
    public String toString() {
        return "This is from Circle object" + "\n" + "\t" + "a=" + a + "\t"
                + "b=" + b;
    }
}
