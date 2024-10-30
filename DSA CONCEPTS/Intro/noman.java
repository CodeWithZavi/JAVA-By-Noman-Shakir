import java.util.Scanner;

public class noman {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Grade: ");
        String grade = input.nextLine();

        boolean validCredit;
        int credit = 0;

        do {
            validCredit = true;
            System.out.println("Enter credit: ");
            String creditString = input.nextLine();

            try {
                credit = Integer.parseInt(creditString);
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number.");
                validCredit = false;
            }
        } while (!validCredit);

        int gradeValue = 0;
        boolean validGrade = true;

        do {
            validGrade = true;
            if (grade.equalsIgnoreCase("A")) {
                gradeValue = 4;
            } else if (grade.equalsIgnoreCase("B")) {
                gradeValue = 3;
            } else if (grade.equalsIgnoreCase("C")) {
                gradeValue = 2;
            } else if (grade.equalsIgnoreCase("D")) {
                gradeValue = 1;
            } else if (grade.equalsIgnoreCase("F")) {
                gradeValue = 0;
            } else {
                System.out.println("You entered invalid data.");
                validGrade = false;
            }
        } while (!validGrade);

        if (credit == 0) {
            System.out.println("Credit cannot be zero. GPA calculation is not possible.");
        } else {
            int point = gradeValue * credit;
            double gpa = (double) point / credit;

            System.out.println("Grade: " + grade);
            System.out.println("Credit: " + credit);
            System.out.println("Point: " + point);
            System.out.println("GPA: " + gpa);
        }

        input.close();
    }
}
