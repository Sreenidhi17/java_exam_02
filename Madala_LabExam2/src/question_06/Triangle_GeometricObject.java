/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question_06;

import java.util.Scanner;

/**
 *
 * @author S541226
 */
public class Triangle_GeometricObject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        creating the Scanner object so that we can read the input values
        Scanner sc = new Scanner(System.in);
//        to get the entry for side 1        
        System.out.print("Enter side 1 of triangle: ");
//        reading the object and storing to s1
        double s1 = sc.nextDouble();
//        to get the entry for side 2   
        System.out.print("Enter side 2 of triangle: ");
//        reading the object and storing to s2
        double s2 = sc.nextDouble();
//        to get the entry for side 3  
        System.out.print("Enter side 3 of triangle: ");
//        reading the object and storing to s3
        double s3 = sc.nextDouble();
//        creating the triangle object and passing the above read values
        Triangle tri = new Triangle(s1, s2, s3);
        System.out.print("Please enter the color: ");
//        reading the object and storing to color
        String color = sc.next();
        tri.setColo(color);
        System.out.print("enter is color filled option should be true/false ");
//        reading the object and storing to fill
        boolean fill = sc.nextBoolean();
        tri.setFilled(fill);
//        printing the tostring from triangle class
        System.out.println(tri.toString());
    }

}
