package org.example.DesignPatterns.PrototypeAndRegistryPattern;

import java.util.HashMap;
import java.util.Map;

public class StudentRegistry {
    // "DataScience" => template
    // "Devops" => template
    private Map<StudentType , Student> students = new HashMap<>();

    public StudentRegistry(){

       //theses are not required here we can put in templaye clsss

        Student dataScienceStudent = new Student(2020, 1 , "Rahul", 90.0);
        dataScienceStudent.setCourse("Data Science");
        dataScienceStudent.setAmountPaid(500);
        dataScienceStudent.setLengthCourse(12);

        Student devopsStudent = new Student(2020, 1 , "Rahul", 90.0);
        devopsStudent.setCourse("Devops");
        devopsStudent.setAmountPaid(200);
        devopsStudent.setLengthCourse(9);

        Student softwareStudent = new Student(2020, 1 , "New Student", 90.0);
        softwareStudent.setCourse("Software");
        softwareStudent.setAmountPaid(600);
        softwareStudent.setLengthCourse(18);
        //ends here
        students.put(StudentType.DATASCIENCE , dataScienceStudent);
        students.put(StudentType.DEVOPS , devopsStudent);
        students.put(StudentType.SOFTWARE , softwareStudent);
    }

    public void add(StudentType key , Student student){
        students.put(key , student);
    }
//returing the copy of exsusting object
    public Student get(StudentType key){
        return students.get(key).copy();
    }
}
