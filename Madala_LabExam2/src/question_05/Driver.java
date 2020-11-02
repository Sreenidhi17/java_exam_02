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
public class Driver {

    public static void main(String[] args) {
//        creating the person object and initializing
        Person person = new Person("sree", "Bloomington IL", "1234567890",
                "dafh@gmail.com");
//        creating the student object and initializing
        Student student = new Student("Graduate", "A", "john", "Rochester, NY",
                "2345678900", "dreweafh@gmail.com");
//        creating the employee object and initializing
        Employee employee = new Employee("office", 7000, "01/01/2019", "june",
                "chicago, IL", "09876543211", "june@gmail.com");
//       creating the faculty object and initializing
        Faculty faculty = new Faculty("5:00pm to 9:00pm", 3, "office", 8000,
                "01/01/2019", "anil", "maryville, mo", "8901234567",
                "anil@gmail.com");
//        creating the staff object and initializing
        Staff staff = new Staff("Associate", "office", 9000, "01/01/2019",
                "ram", "Kansas City, KS", "8787878787", "dreweafh@gmail.com");
//        invoking the toString method in person class
        System.out.println(person.toString());
//        invoking the toString method in student class
        System.out.println(student.toString());
//        invoking the toString method in employee class
        System.out.println(employee.toString());
//        invoking the toString method in faculty class
        System.out.println(faculty.toString());
//        invoking the toString method in staff class
        System.out.println(staff.toString());
    }

}
