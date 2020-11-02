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
public class Triangle extends GeometricObject {

    private double s1;
    private double s2;
    private double s3;

    /**
     * constructor for triangle
     *
     * @param s1
     * @param s2
     * @param s3
     */
    public Triangle(double s1, double s2, double s3) {
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
    }

    /**
     * gets the s1
     *
     * @return s1
     */
    public double getS1() {
        return s1;
    }

    /**
     * sets the s1
     *
     * @param s1
     */
    public void setS1(double s1) {
        this.s1 = s1;
    }

    /**
     * gets the s2
     *
     * @return s2
     */
    public double getS2() {
        return s2;
    }

    /**
     * sets the s2
     *
     * @param s2
     */
    public void setS2(double s2) {
        this.s2 = s2;
    }

    /**
     * gets the s3
     *
     * @return s3
     */
    public double getS3() {
        return s3;
    }

    /**
     * sets the s3
     *
     * @param s3
     */
    public void setS3(double s3) {
        this.s3 = s3;
    }

    /**
     * gets the perimeter of the triangle
     *
     * @return double
     */
    public double getPerimeter() {
        return this.getS1() + this.getS2() + this.getS3();
    }

    /**
     * gets the area of the triangle
     *
     * @return double
     */
    public double getArea() {
        double peri = getPerimeter() / 2;
        return Math.sqrt(peri * (peri - this.getS1()) * (peri - this.getS2())
                * (peri - this.getS3()));
    }

    /**
     * prints the info of the Triangle
     *
     * @return String
     */
    @Override
    public String toString() {
        return "Triangle with sides : " + s1 + "," + s2 + "," + s3 + " and "
                + super.toString() + " has Area : " + getArea()
                + " and Perimeter is" + " : " + getPerimeter();
    }
}
