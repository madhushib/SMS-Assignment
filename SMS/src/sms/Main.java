/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package sms;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 *
 * @author 100056C
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Context.xml");
        StudentRepository ssp = new SimpleStudentRepository();
        StudentManagementSystem sms = new StudentManagementSystem(ssp);
        ssp.saveStudent((Student)context.getBean("student1"));
        ssp.saveStudent((Student)context.getBean("student2"));
        ssp.saveStudent((Student)context.getBean("student3"));
        
        sms.listAllStudents();

    }

}
