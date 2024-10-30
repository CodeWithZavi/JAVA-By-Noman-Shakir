/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */



 /**
  *
  * @author Sardar Noman Shakir
  */
 
 /* Noman Shakir( FA22-BSE-115) Group Leader
  
 */
 
 import java.util.Random;
 
 public class Randomizer {
 
     public static void main(String[] args) {
         Randomizer ran = new Randomizer();
 
         ran.input(3);
         ran.input(10);
         ran.input(12);
         ran.input(13);
         ran.input(20);
         ran.print();
         System.out.println("extract number = " + ran.output());
         ran.print();
     }
 
     int[] arr = new int[5];
     int head = -1;
     int index;
     Random random = new Random();
 
     public Randomizer() {
         for (int i = 0; i < arr.length; i++) {
             arr[i] = -1;
         }
     }
     public boolean isFull() {
         return head == arr.length - 1;
     }
 
     public boolean isEmpty() {
         return head == -1;
     }
 
    public void print() {
     for (int i = head; i >= 0; i--) {
         System.out.println(arr[i]);
     }
 }
     public void input(int number) {
         if (isFull()) {
             System.out.println("stack overflow");
             return;
         }
         index = random.nextInt(arr.length);
         while (arr[index] != -1) {
             index = random.nextInt(arr.length);
         }
         arr[index] = number;
         head++;
     }
 
     public int output() {
         if (isEmpty()) {
             System.out.println("stack underflow");
             return -1;
         }
         index = random.nextInt(arr.length);
         while (arr[index] == -1) {
             index = random.nextInt(arr.length);
         }
         int val = arr[index];
         arr[index] = -1;
         head--;
         return val;
     }
 }
 