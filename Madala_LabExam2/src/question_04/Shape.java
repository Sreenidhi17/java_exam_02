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
public class Shape {

    public double s1; 
    public double s2;

    /**
     * constructor for Shape class
     * @param s1
     * @param s2
     */
    public Shape(double s1, double s2) {
        this.s1 = s1;
        this.s2 = s2;
    }
    
    /**
     * gets the Area for shape
     * @return Area
     */
    public double getArea() { 
        System.out.println("Area for given shape is not defined.");
         return 0; 
    }    
}
