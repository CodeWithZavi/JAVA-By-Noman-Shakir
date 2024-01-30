/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author FA22-BSE-115
 */
import java.io.Serializable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

 class Student123 implements Serializable {
    private String name;
    private int age;
    private String rollNumber;

    public Student123(String name, int age,String rollNumber) {
        this.name = name;
        this.age = age;
        this.rollNumber = rollNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
    }

    public void printDetails() {
        System.out.println("Name =  " + name);
        System.out.println("Age = " + age);
        System.out.println("Roll Number = " + rollNumber);
    }

}
public class QuestionFile{
    
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // Create a Student object
        Student123 cal2 = new Student123("Talha Rehman", 20, "159");

        try (FileOutputStream calling1 = new FileOutputStream("D:\\student123.ser")) {
            ObjectOutputStream call2 = new ObjectOutputStream(calling1);
            call2.writeObject(cal2 );
            call2.close();
        }
        
        Student123 student2;
        try (FileInputStream calling = new FileInputStream("D:\\student123.ser")) {
            ObjectInputStream calling2 = new ObjectInputStream( calling);
            student2 = (Student123) calling2.readObject();
            calling2.close();
        }
        student2.printDetails();
    }
}

