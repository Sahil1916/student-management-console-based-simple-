package org.example;

import java.util.ArrayList;

public class StudentService {

    ArrayList <Student> students = new ArrayList<>();

    public void addStudent( Student s){
        students.add(s);
        System.out.println("The student  is added successfully");
    }

    public void viewAllStudent() {
        if(students.isEmpty()){
            System.out.println("there is no students in there list ");
        }else {
            for(Student s : students ){
                s.Display();
            }
        }
    }
    public void deleteId(int delID) {
    Student toremove = null;
    for(Student s : students ){
        if(s.getId() == delID){
            toremove = s;
            break;
        }
    }if (toremove != null){
            students.remove(toremove);
            System.out.println("Student remove successfully ");
        }else {
            System.out.println("the student not is in list");
        }

    }
}
