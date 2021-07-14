
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nick
 */
public class CoinFlip {
    public static void main(String[] args){
        

    Random randomizer = new Random();    
    // instructions specify not using nexInt() in code
    //boolean used instead
    boolean coin= randomizer.nextBoolean();
    System.out.println("It's time to flip a coin!");
    
    for(int i=0; i<=10; i++){
        if(coin==true)
            System.out.println("You got Heads!");
        else
            System.out.println("You got Tails!");
    
        coin= randomizer.nextBoolean();
    }
           
    }
}
