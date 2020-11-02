/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question_07;

/**
 *
 * @author Sreenidhi Madala
 */
public enum Drinks {
    /**
     * price for FOUNTAIN SODA 20 OZ
     */
    FOUNTAIN_SODA_20_OZ(2.99),
    /**
     * price for RED BULL
     */
    RED_BULL(4.29),
    /**
     * price for IZZE SPARKLING JUICE
     */
    IZZE_SPARKLING_JUICE(2.79),
    /**
     * price for FRESH_BREWED ICED TEA
     */
    FRESH_BREWED_ICED_TEA(2.99),
    /**
     * price for water
     */
    WATER(0.00);

    public double drinkPrice;

    private Drinks(double drinkPrice) {
        this.drinkPrice = drinkPrice;
    }

    /**
     * gets the prices for drink
     *
     * @return drinkPrice
     */
    public double getDrinkPrice() {
        return drinkPrice;
    }

}
