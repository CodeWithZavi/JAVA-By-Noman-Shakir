/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ZAVIAN ~
 */
import java.util.Scanner;
public class UniClass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        student call = new student();
        call.input();
        call.Print();
    }
}
class student {
    int rollNo;
     double CGPA;
    String name;
    
   
    String Section;
    
    void input() {
        try (Scanner in = new Scanner(System.in)) {
            
            rollNo = in.nextInt();
            CGPA = in.nextDouble();
            name = in.nextLine();
            Section = in.nextLine();
        }
    }
    
    void Print() {
        System.out.println("Your name is " + name);
        System.out.print("Your rollno is " + rollNo);
        System.out.printf("Your CGPA is %.2f\n", CGPA); 
        System.out.println("Your Section " + Section);
    }
}

