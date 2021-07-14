
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nick
 */
public class BirthStones {
    public static void main (String[] args){
          
         Scanner keyboard = new Scanner(System.in);
         int choice;
         
         String[] stoneName = {"Garnet", "Amethyst", "Aquamarine", "Diamond","Emerald",
                               "Pearl", "Ruby", "Peridot", "Sapphire", "Opal", "Topaz", "Turquoise"};
         
         String[] monthName = {"January", "February", "March", "April","May",
                               "June", "July", "August", "September", "October", "November", "December"};
         
         System.out.println("What month's birthstone do you want to know?: ");
         choice = keyboard.nextInt();
         
         if(choice <= 0 || choice > 12){
             System.out.println("Sorry, but your choice of " + choice+ " does not match any month.");     
         }else{
             choice -=1;
             System.out.print(monthName[choice] + "'s birthstone is " +stoneName[choice]);
         } 
                 
 
         
         
    }
}
