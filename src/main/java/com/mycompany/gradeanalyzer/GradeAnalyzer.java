/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gradeanalyzer;

/**
 *
 * @author pc
 */
import java.util.Scanner;

public class GradeAnalyzer{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many students? ");
        int n = input.nextInt();
        int[] grades = readScores(input, n);
        double avg = avarage(grades);

        System.out.println();
        System.out.print("Scores: ");
        printScore(grades);
        System.out.println();
        System.out.printf("Average: %.2f%n", avg);
        System.out.println("Highest: " + max(grades));
        System.out.println("Lowest: " + min(grades));
        System.out.println("Above average: " + countAbove(grades, avg));
    }

    public static int[] readScores(Scanner input, int n) {
        int[] grades = new int[n];
        for (int i = 0; i < n; i++) {
            int grade;
            do {
                System.out.print("Enter score " + (i + 1) + ": ");
                grade = input.nextInt();
                if (grade < 0 || grade > 100) {
                    System.out.println("Invalid score, try again.");
                }
            } while (grade < 0 || grade > 100);
            grades[i] = grade;
        }
        return grades;
    }

    public static double avarage(int[] grades) {
        double sum = 0.0;
        double avarage = 0;
        for (int i = 0; i < grades.length; i++) {
            sum += grades[i];
        }
        avarage = sum / grades.length;
        return avarage;
    }

    public static int max(int[] grades) {
        int max = grades[0];
        for (int i = 1; i < grades.length; i++) {
            if (grades[i] > max) {
                max = grades[i];
            }
        }
        return max;
    }

    public static int min(int[] grades) {
        int min = grades[0];
        for (int i = 1; i < grades.length; i++) {
            if (grades[i] < min) {
                min = grades[i];
            }
        }
        return min;
    }

    public static int countAbove(int[] grades, double avarage) {
        int count = 0;
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] > avarage) {
                count++;
            }
        }
        return count;
    }

    public static void printScore(int[] grades) {
        for (int i = 0; i < grades.length; i++) {
            System.out.print(grades[i] + " ");
        }
    }
}
