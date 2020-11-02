/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question_01;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Sreenidhi Madala
 */
public class DistinctIntegers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        creating a new arraylist of an integer 
        ArrayList<Integer> dist = new ArrayList<>();
//        creating the Scanner object so that we can read the input values
        Scanner sc = new Scanner(System.in);
//        to get the entry for integers
        System.out.print("Enter ten integers: ");
//        declaring the size of integer array
        int[] integers = new int[10];
//        for loop to read the integers and add it to arraylist
        for (int i = 0; i < 10; i++) {
            integers[i] = sc.nextInt();
            dist.add(integers[i]);
        }
//        closing the scanner object
        sc.close();
//      removes the duplicates   
        duplicates.removeduplicate(dist);
        System.out.print("The distinct integers are ");
//        prints the final integers after removing the duplicates.
        for (int i = 0; i < dist.size(); i++) {
            System.out.print(dist.get(i) + " ");
        }
    }

}
