package org.example;

import java.awt.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentService service = new StudentService();
        int choice;
        do {


        System.out.println("================WELCOME TO STUDENT MANAGEMENT SIMPLE SYSTEM");
        System.out.println("choose option what did ypu do ");
        System.out.println(" choose 1 for Add Student ");
        System.out.println(" choose 2 for view all Students ");
        System.out.println("choose 3 for delete student data ");
        System.out.println("choose 4 for EXIT");
            System.out.println("Enter Choice ");
            choice = sc.nextInt();

        switch (choice){
            case 1:
                System.out.println("Enter ID ");
                int id = sc.nextInt();
                sc.nextLine();

                System.out.println("Enter name ");
                String name = sc.nextLine();

                System.out.println("Enter age ");
                int age = sc.nextInt();

                Student s = new Student(id,name,age);
                service.addStudent(s);

                break;
            case 2 :
                System.out.println("view all Student");
                service.viewAllStudent();
                break;

            case 3 :
                System.out.println("enter ID to delete ");
                int DelID = sc.nextInt();
                service.deleteId(DelID);


                break;
            case 4:
                System.out.println("Exiting....................");


                break;

            default:
                System.out.println("invalid option");
                break;
        }
          }while (choice !=4);
        sc.close();
    }

    }
