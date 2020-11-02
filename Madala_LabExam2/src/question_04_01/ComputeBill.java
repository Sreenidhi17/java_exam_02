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
public class ComputeBill {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        creating the new objects for claculateBill and Student
        CalcuateBill calcuateBill = new CalcuateBill("Sreenidhi",
                "Bloomington,IL", 123, 3500.00);
        Student student = new Student("sree", "chicago,IL", 121);
        System.out.println("Compute bill using claculate bill");
//        incoking the mailbill in CalcuateBill class
        calcuateBill.mailBill();
        System.out.println("Compute bill using student ref");
//        incoking the mailbill in student class
        student.mailBill();
    }

}
