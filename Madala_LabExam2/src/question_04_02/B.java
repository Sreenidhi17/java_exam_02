/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question_04_02;

import question_04_02.A.Alpha;

/**
 *
 * @author Sreenidhi Madala
 */
public class B {
//    creating a subclass extending superclass

    public static class Beta extends Alpha {
//            method to pint overriding the superclass method

        @Override
        public void print() {
            System.out.println("printing in beta.");
        }
    }

}
