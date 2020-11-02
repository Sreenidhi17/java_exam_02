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
public class Student extends Person {

    public final static String status = "Graduate";
    public String class_Status;
    public String grade;

    /**
     * constructor for Student
     *
     * @param class_Status
     * @param grade
     * @param name
     * @param address
     * @param phone_number
     * @param email_address
     */
    public Student(String class_Status, String grade, String name, 
            String address, String phone_number, String email_address) {
        super(name, address, phone_number, email_address);
        this.class_Status = status;
        this.grade = grade;
    }

    /**
     * gets the class_Status of Student
     *
     * @return class_Status
     */
    public String getClass_Status() {
        return class_Status;
    }

    /**
     * sets the class_Status
     *
     * @param class_Status
     */
    public void setClass_Status(String class_Status) {
        this.class_Status = class_Status;
    }

    /**
     * gets the grade of student
     *
     * @return grade
     */
    public String getGrade() {
        return grade;
    }

    /**
     * sets the grade
     *
     * @param grade
     */
    public void setGrade(String grade) {
        this.grade = grade;
    }

    /**
     * gives the info of student
     *
     * @return String
     */
    @Override
    public String toString() {
        return super.toString() + " class_Status " + getClass_Status() + 
                " Grade " + getGrade();
    }

}
