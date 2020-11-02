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
public class Triangle extends Shape {

    /**
     * constructor for Triangle
     *
     * @param s1
     * @param s2
     */
    public Triangle(double s1, double s2) {
        super(s1, s2);
    }

    /**
     * gets the area of Triangle
     *
     * @return Area
     */
    public double getArea() {
        System.out.println("calculating area in Triangle class");
        return (s1 * s2) / 2;
    }

}
