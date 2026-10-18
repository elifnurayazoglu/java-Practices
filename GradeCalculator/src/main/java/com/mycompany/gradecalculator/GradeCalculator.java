/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gradecalculator;

/**
 *
 * @author pc
 */
import java.util.Scanner;
public class GradeCalculator {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        System.out.println("Please enter your full name(at least two name, at most three name): ");
        String fullName = input.nextLine().trim();
        int first = fullName.indexOf(' ');
        
       
        
        if(first == -1){
            System.out.println("Please enter exactly your full name. ");
            input.close();
            return;     //Hatalı girişte program burda biter aşağıdakiler çalışmaz.
        }
        
        int last = fullName.lastIndexOf(' ');
        int secondSpace = fullName.indexOf(' ', first+1);
        
        if(secondSpace != -1 && secondSpace != last){
            System.out.println("Please enter exactly two or three names: ");
            input.close();
            return;
        }
        
        
        
         String sumName;
        if (first==last){
            String firstName = fullName.substring(0,first);
            String surname = fullName.substring(first+1);
            sumName = Character.toUpperCase(firstName.charAt(0)) + ". " 
                     + Character.toUpperCase(surname.charAt(0)) + ".";
        }else{
            String firstName = fullName.substring(0,first);
            String secondName = fullName.substring(first+1, last);
            String surname = fullName.substring(last+1);
            sumName = Character.toUpperCase(firstName.charAt(0)) + ". " 
                      + Character.toUpperCase(secondName.charAt(0)) + ". "
                      + Character.toUpperCase(surname.charAt(0)) + ".";
        }
        
          
       
        System.out.println("Please enter your quiz grade: ");
        double quiz = input.nextDouble();
        System.out.println("Please enter your midterm grade: ");
        double midterm = input.nextDouble();
        System.out.println("Please enter your final grade: ");
        double finalE = input.nextDouble();
        
        if(quiz<0 || quiz>100){
            System.out.println("Wrong grade!");
            input.close();
            return;
        }if (midterm<0 || midterm>100){
            System.out.println("Wrong grade!");
            input.close();
            return;
        }if(finalE<0 || finalE>100){
            System.out.println("Wrong grade!");
            input.close();
            return;
        }
        
        
        double average = (quiz*0.20)+(midterm*0.30)+(finalE*0.50);
        
        String situation;
        if(average>=90){
            situation = "AA";
        }else if(average>=80){
            situation = "BB";
        }else if(average>=70){
            situation = "CC";
        }else if (average>=60){
            situation = "DD";
        }else{
            situation = "FF";
        }
      
        
        System.out.println();
        System.out.printf("%-15s%12s%12s%12s%n", "Name", "Quiz", "Midterm", "Final");
        System.out.printf("%-15s%12.2f%12.2f%12.2f%n", sumName, quiz, midterm, finalE);
        System.out.printf("%-15s%36.2f%n", "Average", average);
        System.out.printf("%-15s%34s%n", "Letter Grade: ",situation );
        System.out.println();
  
        
        if (situation.equals("AA")){
            System.out.println("Very well, keep it up :)");
        }else if (situation.equals("BB")){
            System.out.println("Very well!!!");
        }else if(situation.equals("CC")){
            System.out.println("Good :)");
        }else if(situation.equals("DD")){
            System.out.println("It could be better.");
        }else{
            System.out.println("You failed the course. Study more...");
        }
        
      input.close();
    }
}
