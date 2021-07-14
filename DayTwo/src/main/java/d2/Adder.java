/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package d2;

/**
 *
 * @author Nick
 */
import java.util.Scanner;

public class Adder {
    
    public static void main(String[] args){
        
        int sum, op1, op2;
        
        Scanner keyboard = new Scanner(System.in);
        
     //   String Sopt1, Sopt2;
        
        System.out.print("Enter the first number: ");
        op1 = keyboard.nextInt();
       // Sopt1 = keyboard.nextLine();
        
        System.out.print("Enter the second number: ");
        op2 = keyboard.nextInt();
        //Sopt2 = keyboard.nextLine();
    
        sum = op1+op2;
        
        System.out.println("Integer form: " + sum );
        
    }
    
}
