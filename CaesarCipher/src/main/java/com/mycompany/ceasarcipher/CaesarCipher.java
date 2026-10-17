/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ceasarcipher;

/**
 *
 * @author pc
 */
import java.util.Scanner;
public class CaesarCipher {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please enter a lowercase letter: ");
        String letter = input.nextLine();
        char ch =letter.charAt(0);
        
        if(ch<'a' || ch>'z'){
            System.out.println("Please enter exactly a lowercase letter!!");
        }else{
            
             System.out.println("Please enter the shift amount: ");
             int k = input.nextInt();
        
             int line = ch - 'a';
             int newLine = (line + k)%26;
             char newch = (char)('a' + newLine);
              System.out.printf("Encrypted letter: %c%n", newch);
      
        
        }
      
  
        
    }
}
