import java.util.Scanner;
import java.util.ArrayList;

class Student {
    String name;
    int marks1, marks2, marks3;
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        System.out.print("Enter the no.of students: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            System.out.println("\nEnter details of Student " + i);

            System.out.print("Enter name: ");
            String name = sc.next();

            System.out.println("ENTER MARKS");

            System.out.print("DBMS: ");
            int marks1 = sc.nextInt();

            System.out.print("AI: ");
            int marks2 = sc.nextInt();

            System.out.print("OOPS: ");
            int marks3 = sc.nextInt();

            Student s = new Student();

            s.name = name;
            s.marks1 = marks1;
            s.marks2 = marks2;
            s.marks3 = marks3;

            students.add(s);
        }

        // Display each student's result
        for (Student stu : students) {

            int total = stu.marks1 + stu.marks2 + stu.marks3;
            double average = total / 3.0;

            System.out.println("\n===========================");
            System.out.println("NAME: " + stu.name);

            // Highest marks
            if (stu.marks1 >= stu.marks2 && stu.marks1 >= stu.marks3) {
                System.out.println(stu.marks1 + " is highest");
            } else if (stu.marks2 >= stu.marks1 && stu.marks2 >= stu.marks3) {
                System.out.println(stu.marks2 + " is highest");
            } else {
                System.out.println(stu.marks3 + " is highest");
            }

            // Lowest marks
            if (stu.marks1 <= stu.marks2 && stu.marks1 <= stu.marks3) {
                System.out.println(stu.marks1 + " is lowest");
            } else if (stu.marks2 <= stu.marks1 && stu.marks2 <= stu.marks3) {
                System.out.println(stu.marks2 + " is lowest");
            } else {
                System.out.println(stu.marks3 + " is lowest");
            }

            System.out.println("TOTAL: " + total);
            System.out.println("AVERAGE: " + average);

            // Grade
            if (average >= 90) {
                System.out.println("GRADE: A");
            } else if (average >= 80) {
                System.out.println("GRADE: B");
            } else if (average >= 70) {
                System.out.println("GRADE: C");
            } else if (average >= 60) {
                System.out.println("GRADE: D");
            } else if (average >= 50) {
                System.out.println("GRADE: E");
            } else {
                System.out.println("FAIL!!");
            }

            System.out.println("===========================");
        }

        // Finding class topper
        int highestScore = 0;
        String topper = "";

        for (Student s : students) {

            int total = s.marks1 + s.marks2 + s.marks3;

            if (total > highestScore) {
                highestScore = total;
                topper = s.name;
            }
        }

        System.out.println("\nTOPPER OF THE CLASS: " + topper);
        System.out.println("TOP SCORE: " + highestScore);

        sc.close();
    }
}
