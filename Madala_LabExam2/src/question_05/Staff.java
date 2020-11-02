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
public class Staff extends Employee {

    public String title;

    /**
     * constructor for Staff
     *
     * @param title
     * @param office
     * @param salary
     * @param date_Hired
     * @param name
     * @param address
     * @param phone_number
     * @param email_address
     */
    public Staff(String title, String office, double salary, String date_Hired,
            String name, String address, String phone_number,
            String email_address) {
        super(office, salary, date_Hired, name, address, phone_number,
                email_address);
        this.title = title;
    }

    /**
     * gets the title of staff
     *
     * @return title
     */
    public String getTitle() {
        return title;
    }

    /**
     * sets the title
     *
     * @param title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * gives the info of faculty
     *
     * @return String
     */
    @Override
    public String toString() {
        return super.toString() + " title " + title + '}';
    }

}
