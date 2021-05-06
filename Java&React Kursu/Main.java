/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gun3;

/**
 *
 * @author Lenovo y50-70
 */
public class Main {
    public static void main(String[] args){
        
        Student student new Student();
        student.setFirstname(Zeliha);
        
        StudentManager studentManager = new StudentManager();
        studentManager.add(student);
        
        Instructor instructor=new Instructor();
        instructor.setFirstname(Engin);
        
        InstructorManager instructorManager= new InstructorManager();
        instructorManager.add(instructor);
        
        
    }
    
}
