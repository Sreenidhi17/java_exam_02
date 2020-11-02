/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question_02;

/**
 *
 * @author Sreenidhi Madala
 */
public class equal {

    /**
     * equals method that accepts 2-D array
     *
     * @param list1
     * @param list2
     * @return true or false
     */
    public static boolean equals(int[][] list1, int[][] list2) {
//        checking the length of the 2 list and returns true if equal
        if (list1.length * list1[0].length != list2.length * list2[0].length) {
            return false;
        }
//        for loop to check each and every element if equal and indentical 
//          return true if equal and identical
        for (int i = 0; i < list1.length; i++) {
            for (int j = 0; j < list2.length; j++) {
                if (list1[i][j] != list2[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
