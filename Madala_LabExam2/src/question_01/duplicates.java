/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question_01;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Sreenidhi Madala
 */
public class duplicates {
    
    /**
     * removes the duplicate elements from the list
     * @param lis
     */
    public static void removeduplicate(ArrayList<Integer> lis){
//       loop for array list of integers 
        for (int i = 0; i < lis.size(); i++) {
            Integer abc = lis.get(i);
//            gets the element and add it to new list
            List list = lis.subList(i+1, lis.size());
//            remove the list when it have abc
            while(list.contains(abc)){
                list.remove(abc);
            }
        }
        
    }
    
}
