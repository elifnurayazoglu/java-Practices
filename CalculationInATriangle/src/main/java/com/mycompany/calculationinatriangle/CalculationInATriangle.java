/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.calculationinatriangle;

/**
 *
 * @author pc
 */
import java.util.Scanner;

public class CalculationInATriangle {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the triangle's coordinates: \n X1: \n Y1:");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();

        System.out.println(" X2: \n Y2: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        System.out.println(" X3: \n Y3: ");
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();

        double a = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
        double b = Math.sqrt(Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2));
        double c = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        System.out.printf("%-8s%7s%7s%n", "Axes", "X", "Y");
        System.out.printf("%-8s%7s%7.2f%n", "X1, Y1", x1, y1);
        System.out.printf("%-8s%7s%7.2f%n", "X2, Y2", x2, y2);
        System.out.printf("%-8s%7s%7.2f%n", "X3, Y3", x3, y3);
        System.out.println();

        System.out.printf("%-10s%8s%n", "Side Length", "Values");
        System.out.printf("%-10s%8.2f%n", "Side a", a);
        System.out.printf("%-10s%8.2f%n", "Side b", b);
        System.out.printf("%-10s%8.2f%n", "Side c", c);
        System.out.println();

        double angle1 = Math.toDegrees(Math.acos((a * a - b * b - c * c) / (-2 * b * c)));
        double angle2 = Math.toDegrees(Math.acos((b * b - a * a - c * c) / (-2 * a * c)));
        double angle3 = Math.toDegrees(Math.acos((c * c - b * b - a * a) / (-2 * b * a)));

        System.out.printf("%-8s%8s%n", "Angles", "Values");
        System.out.printf("%-8s%6.2f%n", "Angle 1: ", angle1);
        System.out.printf("%-8s%6.2f%n", "Angle 2: ", angle2);
        System.out.printf("%-8s%6.2f%n", "Angle 3: ", angle3);
        System.out.println();
        System.out.println("Sum of the angles: " + (angle1 + angle2 + angle3));

        double s = (a + b + c) / 2;
        double alan = Math.sqrt((s * (s - a) * (s - b) * (s - c)));
        System.out.println("Area of the triangle: " + alan);

        input.close();
    }
}
