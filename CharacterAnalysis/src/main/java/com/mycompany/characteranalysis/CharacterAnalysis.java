/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.characteranalysis;

/**
 *
 * @author pc
 */
import java.util.Scanner;

public class CharacterAnalysis {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a character: ");
        String chr = input.nextLine();

        if (chr.length() != 1) {
            System.out.println("Please enter exactly one character!!");
        } else {
            char newchr = chr.charAt(0);
            char lower = Character.toLowerCase(chr.charAt(0));

            if (Character.isLetter(newchr)) {

                if (newchr == Character.toLowerCase(newchr)) {
                    System.out.println("You entered a lowecase letter.");
                } else {
                    System.out.println("You entered an uppercase letter.");
                }

                if ("aeiou".indexOf(lower) != -1) {
                    System.out.println("The letter is a vowel.");
                } else {
                    System.out.println("The letter is a consonant.");
                }

            } else if (Character.isDigit(newchr)) {
                System.out.println("The character is a digit.");
            } else {
                System.out.println("The character is a symbol.");
            }

        }

    }
}
