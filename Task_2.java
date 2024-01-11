package codesoft_project;

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the marks of english : ");
        // int English = sc.nextInt();
        // System.out.println("Enter the marks of hindi : ");
        // int Hindi = sc.nextInt();
        // System.out.println("Enter the marks of mathematics : ");
        // int Mathematics = sc.nextInt();
        // System.out.println("Enter the marks of science : ");
        // int Science = sc.nextInt();
        // System.out.println("Enter the marks of social science : ");
        // int Social_Science = sc.nextInt();

        System.out.println("Enter the number of subject : ");
        int total_subject = sc.nextInt();
        int marks[] = new int[total_subject];

        int total_marks = 0;
        for (int i = 1; i <= marks.length; i++) {
            System.out.println("Enter " + i + "th subject marks(out of 100) : ");
            marks[i - 1] = sc.nextInt();
            total_marks += marks[i - 1];
        }

        double aver_percentage = (total_marks * 1.0) / total_subject;

        char grade = 'F';
        if (aver_percentage >= 80) {
            grade = 'A';
        } else if (aver_percentage >= 70 && aver_percentage < 80) {
            grade = 'B';
        } else if (aver_percentage >= 60 && aver_percentage < 70) {
            grade = 'C';
        } else if (aver_percentage >= 50 && aver_percentage < 60) {
            grade = 'D';
        } else if (aver_percentage >= 40 && aver_percentage < 50) {
            grade = 'E';
        }
        System.out.println("Total marks : " + total_marks);
        System.out.println("Average percentage : " + aver_percentage);
        System.out.println("Grade : " + grade);
        sc.close();
    }
}
