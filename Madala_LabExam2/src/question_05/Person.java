/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question_05;

/**
 *
 * @author Sreenidhi Madala
 */
public class Person {

    public String name;
    public String address;
    public String phone_number;
    public String email_address;

    /**
     * Constructor for Person
     *
     * @param name
     * @param address
     * @param phone_number
     * @param email_address
     */
    public Person(String name, String address, String phone_number, String email_address) {
        this.name = name;
        this.address = address;
        this.phone_number = phone_number;
        this.email_address = email_address;
    }

    /**
     * gets the name of person
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * sets the name
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * gets the address of person
     *
     * @return address
     */
    public String getAddress() {
        return address;
    }

    /**
     * sets the address
     *
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * gets the phone_number of person
     *
     * @return phone_number
     */
    public String getPhone_number() {
        return phone_number;
    }

    /**
     * sets the phone_number
     *
     * @param phone_number
     */
    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    /**
     * gets the email_address of a person
     *
     * @return email_address
     */
    public String getEmail_address() {
        return email_address;
    }

    /**
     * sets email_address
     *
     * @param email_address
     */
    public void setEmail_address(String email_address) {
        this.email_address = email_address;
    }

    /**
     * gives the info of person
     *
     * @return string
     */
    @Override
    public String toString() {
        return "Person name is " + getName() + " with address as " + getAddress()
                + " phone Number " + getPhone_number() + " and email address is "
                + getEmail_address();
    }
}
