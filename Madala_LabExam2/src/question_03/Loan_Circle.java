/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question_03;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author S541226
 */
public class Loan_Circle {

    public static void main(String[] args) {
//        creating the ArrayList of type object 
        ArrayList<Object> obje = new ArrayList<>();
//        adding the objects to arraylist crated.
//        adding loan object to arralylist  
        obje.add(new Loan(123456L, 2000.0, 123.0));
//        adding String  to arralylist
        obje.add("The input String which i've provided to add to array list");
//        adding date object to arralylist which gives current date
        obje.add(new Date());
//        adding Circle object to arralylist
        obje.add(new Circle(2.0, 2.0));
//         loop to display all the elements in the list by invoking the object’s
//          toString() method.
        for (Object object : obje) {
            System.out.println(object.toString());
        }
    }

}
