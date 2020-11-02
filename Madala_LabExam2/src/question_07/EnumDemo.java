/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question_07;

/**
 *
 * @author S541226
 */
public class EnumDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Drinks ap;
        // Display price of IZZE SPARKLING JUICE. 
        System.out.println("IZZE SPARKLING JUICE costs "
                + Drinks.IZZE_SPARKLING_JUICE.getDrinkPrice());
        // Display all Drinks and prices. 
        System.out.println("All Drinks prices:");
//        loop to print all the drinks from drinks 
        for (Drinks a : Drinks.values()) {
            System.out.println(a + " costs " + a.getDrinkPrice());
        }
    }

}
