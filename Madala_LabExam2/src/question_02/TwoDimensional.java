/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question_02;

import java.util.Scanner;

/**
 *
 * @author Sreenidhi Madala
 */
public class TwoDimensional {

    public static void main(String[] args) {
//        creating the Scanner object so that we can read the input values
        Scanner sc = new Scanner(System.in);
//        creating a 2-D array of list1 
        int list1[][] = new int[3][3];
//        creating a 2-D array of list2 
        int list2[][] = new int[3][3];
//        to get the entry for integers to list1         
        System.out.print("Enter list1: ");
//        for loops to read 2-D Arrays of list1
        for (int[] list11 : list1) {
            for (int j = 0; j < list11.length; j++) {
                list11[j] = sc.nextInt();
            }
        }
//        to get the entry for integers to list2         
        System.out.print("Enter list2: ");
//        for loops to read 2-D Arrays of list2
        for (int[] list21 : list2) {
            for (int j = 0; j < list21.length; j++) {
                list21[j] = sc.nextInt();
            }
        }
//        checks the equals method from equal class to find wether list1 and 
//          list2 are strictly identical or not
        if (equal.equals(list1, list2)) {
//            if true it prints The two arrays are strictly identical
            System.out.println("The two arrays are strictly identical");
        } else {
//            if false it prints The two arrays are not strictly identical
            System.out.println("The two arrays are not strictly identical");
        }
    }
}
