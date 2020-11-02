/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question_04;

/**
 *
 * @author Sreenidhi Madala
 */
public class Rectangle extends Shape {

    /**
     * constructor for Rectangle
     *
     * @param s1
     * @param s2
     */
    public Rectangle(double s1, double s2) {
        super(s1, s2);
    }

    /**
     * gets the Area for Rectangle
     *
     * @return Area
     */
    public double getArea() {
        System.out.println("calculating area in Rectangle class");
        return s1 * s2;
    }

}
