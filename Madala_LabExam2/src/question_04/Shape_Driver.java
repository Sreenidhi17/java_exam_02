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
public class Shape_Driver {

    public static void main(String[] args) {
//        creating a shape object and adding the values
        Shape sha = new Shape(5, 5);
//        creating a Rectangle object and adding the values
        Rectangle rect = new Rectangle(4, 5);
//        creating a Triangle object and adding the values
        Triangle tri = new Triangle(2, 3);
//        print the values from the classes.
        Shape shape;
        shape = sha;
//        printing the area from shape class
        System.out.println("Area is " + shape.getArea());
        shape = rect;
//        printing the area from Rectangle class
        System.out.println("Area is " + shape.getArea());
        shape = tri;
//        printing the area from Triangle class
        System.out.println("Area is " + shape.getArea());
    }

}
