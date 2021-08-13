package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter student's KCSE grade score: ");
        int grade = input.nextInt();
        System.out.println("Enter student's interview questions score: ");
        int score1 = input.nextInt();
        System.out.println("Enter student's confidence level score");
        int score2 = input.nextInt();
        if (grade >= 65 && score1 >= 6) {
            System.out.println("Student is elligible for admission");
        } else if (grade >= 65 && score2 >= 5) {
            System.out.println("Student is elligible for admission");
        } else {
            System.out.println("Student is not elligible for admission");
        }
    }
}

