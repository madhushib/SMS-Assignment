
package sms;

import java.util.List;


public class StudentManagementSystem {

    private StudentRepository repository;

    public StudentManagementSystem(StudentRepository repo) {
        this.repository = repo;
    }

    StudentManagementSystem() {
      
    }

   

    public void listAllStudents() {
        
        List<Student> list1 = (List<Student>) repository.findAllStudents();
        for (int i = 0; i < list1.size(); i++) {
            System.out.println(i+1 + ". " + list1.get(i).getRegNumber());
        }
    }

    public void registerStudent(Student student) {

        repository.saveStudent(student);
    }
}
