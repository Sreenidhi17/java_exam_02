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
public class Faculty extends Employee {

    public String office_hours;
    public int number_of_teaching_subjects;

    /**
     * constructor for Faculty
     *
     * @param office_hours
     * @param number_of_teaching_subjects
     * @param office
     * @param salary
     * @param date_Hired
     * @param name
     * @param address
     * @param phone_number
     * @param email_address
     */
    public Faculty(String office_hours, int number_of_teaching_subjects,
            String office, double salary, String date_Hired, String name,
            String address, String phone_number, String email_address) {
        super(office, salary, date_Hired, name, address, phone_number,
                email_address);
        this.office_hours = office_hours;
        this.number_of_teaching_subjects = number_of_teaching_subjects;
    }

    /**
     * gets the office_hours of a faculty
     *
     * @return office_hours
     */
    public String getOffice_hours() {
        return office_hours;
    }

    /**
     * sets the office_hours
     *
     * @param office_hours
     */
    public void setOffice_hours(String office_hours) {
        this.office_hours = office_hours;
    }

    /**
     * gets the number_of_teaching_subjects of a faculty
     *
     * @return number_of_teaching_subjects
     */
    public int getNumber_of_teaching_subjects() {
        return number_of_teaching_subjects;
    }

    /**
     * sets number_of_teaching_subjects
     *
     * @param number_of_teaching_subjects
     */
    public void setNumber_of_teaching_subjects(int number_of_teaching_subjects){
        this.number_of_teaching_subjects = number_of_teaching_subjects;
    }

    /**
     * gets the info of faculty
     *
     * @return String
     */
    @Override
    public String toString() {
        return super.toString() + " office_hours " + office_hours
               + ", number_of_teaching_subjects " + number_of_teaching_subjects;
    }

}
