/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.hexdigitconverter;

/**
 *
 * @author pc
 */
import java.util.Scanner;
public class HexDigitConverter {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please enter a hexadecimal digit: ");
        String hex = input.nextLine();
  
        if(hex.length()!= 1){
            System.out.println("Please enter exactly one digit.");
        }else{
            char digit = Character.toUpperCase(hex.charAt(0));
            
            if(Character.isDigit(digit)){
                System.out.println("You entered a digit.");
            }else if (Character.isLetter(digit)){
                System.out.println("You entered a letter.");
            }
             
            if( digit>= '0' && digit<= '9'){
                System.out.println("Decimal value: " + (digit - '0'));
            }else if (digit>= 'A' && digit<= 'F'){
                System.out.println("decimal value: " + (digit - 'A' +10));
            }else{
                System.out.println("Invalid hexadecimal value.");
            }
        }
        
        input.close();
  
        
    }
}
