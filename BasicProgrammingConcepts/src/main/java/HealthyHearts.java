
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nick
 */
import java.util.Scanner;

public class HealthyHearts {
    public static void main(String[] args){
        
        int age;
       
        Scanner keyboard = new Scanner (System.in);
        
        System.out.print("What is your age?: ");
        age=keyboard.nextInt();
        int maxRate = maxHeartBeat(age);
        String hrZone=targetLow(maxRate);
        
        System.out.println("Your maxium heart rate should be "+maxRate+" beats per minute.");
        System.out.println("Your target HR Zone is "+hrZone+" per minute.");
    }
     
    public static int maxHeartBeat(int age){
        int maxHB=220-age;
        return maxHB;
    }

    public static String targetLow(int maxHB){
        double low=Math.round(maxHB*.5);
        double high=Math.round(maxHB*.85);
        
        String range = low+" - "+high;
        return range;
    }
    
}
