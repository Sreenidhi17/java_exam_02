/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question_06;

/**
 *
 * @author Sreenidhi Madala
 */
public abstract class GeometricObject {

    private String colo;
    private boolean fille;

    /**
     * no argument constructor
     */
    protected GeometricObject() {
    }

    /**
     * constructor for GeometricObject
     *
     * @param colo
     * @param fille
     */
    protected GeometricObject(String colo, boolean fille) {
        this.colo = colo;
        this.fille = fille;
    }

    /**
     * gets the info of color
     *
     * @return color
     */
    public String getColo() {
        return colo;
    }

    /**
     * sets the color
     *
     * @param colo
     */
    public void setColo(String colo) {
        this.colo = colo;
    }

    /**
     * checks for fille
     *
     * @return true/false
     */
    public boolean isFille() {
        return fille;
    }

    /**
     * sets the fille
     *
     * @param fille
     */
    public void setFilled(boolean fille) {
        this.fille = fille;
    }

    /**
     * prints the info of the GeometricObject
     *
     * @return string
     */
    @Override
    public String toString() {
        return "Color: " + getColo() + " is Filled: " + isFille();
    }
}
