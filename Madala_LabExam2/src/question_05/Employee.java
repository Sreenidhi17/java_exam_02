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
public class Employee extends Person {

    public String office;
    public double salary;
    public String date_Hired;

    /**
     * constructor for Employee
     *
     * @param office
     * @param salary
     * @param date_Hired
     * @param name
     * @param address
     * @param phone_number
     * @param email_address
     */
    public Employee(String office, double salary, String date_Hired,
            String name, String address, String phone_number,
            String email_address) {
        super(name, address, phone_number, email_address);
        this.office = office;
        this.salary = salary;
        this.date_Hired = date_Hired;
    }

    /**
     * gets the office of employee
     *
     * @return office
     */
    public String getOffice() {
        return office;
    }

    /**
     * sets the office
     *
     * @param office
     */
    public void setOffice(String office) {
        this.office = office;
    }

    /**
     * gets the salary of employee
     *
     * @return salary
     */
    public double getSalary() {
        return salary;
    }

    /**
     * sets the salary
     *
     * @param salary
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }

    /**
     * gets the date_Hired of employee
     *
     * @return date_Hired
     */
    public String getDate_Hired() {
        return date_Hired;
    }

    /**
     * sets the date_Hired
     *
     * @param date_Hired
     */
    public void setDate_Hired(String date_Hired) {
        this.date_Hired = date_Hired;
    }

    /**
     * gives the info of employee
     *
     * @return string
     */
    @Override
    public String toString() {
        return super.toString() + " office " + getOffice() + " salary "
                + getSalary() + " Date Hired is " + getDate_Hired();
    }

}
