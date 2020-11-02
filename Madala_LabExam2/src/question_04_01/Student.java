/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question_04_01;

/**
 *
 * @author Sreenidhi Madala
 */
public class Student {

    private String name;
    private String address;
    private int number;

    /**
     * constructor for Student
     *
     * @param name
     * @param address
     * @param number
     */
    public Student(String name, String address, int number) {
        this.name = name;
        this.address = address;
        this.number = number;
    }

    /**
     * gets the name of student
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * sets the name of the student
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * gets the address of the student
     *
     * @return address
     */
    public String getAddress() {
        return address;
    }

    /**
     * sets the address of the student
     *
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * gets the number of the student
     *
     * @return number
     */
    public int getNumber() {
        return number;
    }

    /**
     * sets the number of the student
     *
     * @param number
     */
    public void setNumber(int number) {
        this.number = number;
    }

    /**
     * sends the mail to corresponding student
     */
    public void mailBill() {
        System.out.println("Mailing a Bill to " + this.name + " " + 
                this.address);
    }

}
