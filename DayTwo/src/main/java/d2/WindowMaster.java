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
public class WindowMaster {

    public static void main(String [] args) {
        // declare variables for height and width
        float height;
        float width;

        // declare String variables to hold the user's height and
        // width input
        String stringHeight;
        String stringWidth;

        // declare other variables
        float areaOfWindow;
        float cost;
        float perimeterOfWindow;
    
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Enter the height of the of the window: ");
        stringHeight = keyboard.nextLine();
        System.out.println("Enter the width of the of the window: ");
        stringWidth = keyboard.nextLine();
        
        
        //convert Strings to Floats
        height = Float.parseFloat(stringHeight);
        width = Float.parseFloat(stringWidth);
    
        //finding Area and Perimeter
        perimeterOfWindow = 2*(width+height);
        areaOfWindow = height*width; 
    
        //finding the cost of the window
        // "F" added after double values to read it as Float
        cost = (3.5F * areaOfWindow) + (2.5F * perimeterOfWindow);
        
        System.out.println("The height of the window is: " + stringHeight);
        System.out.println("The width of the window is: " + stringWidth);
        System.out.println("The perimeter of the window is: " + perimeterOfWindow);
        System.out.println("The area of the window is: " + areaOfWindow);
        System.out.println("The total cost of the window is: " + cost);
    }
}
