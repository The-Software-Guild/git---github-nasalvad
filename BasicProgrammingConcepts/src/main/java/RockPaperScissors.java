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
import java.util.Random;

public class RockPaperScissors {
    
    public static void main(String[] args){
    
        int playerChoice;
        int computerChoice;
        int roundCount;

        Random randomizer = new Random();
        boolean replay = true;
        String replayChoice = "";
        Scanner keyboard = new Scanner(System.in);

        int winCount =0;
        int lossCount =0;
        int tieCount =0;
       
        while(replay != false){

            System.out.print("Enter the number of rounds you'd like to play: ");
            roundCount = keyboard.nextInt();
            
                if(roundCount > 0 && roundCount<= 10){

                    while(roundCount > 0){

                        System.out.print("Enter your choice (rock= 1; paper= 2; scissors= 3): ");
                        playerChoice = keyboard.nextInt();
                        computerChoice = randomizer.nextInt(3)+1;

                        if(playerChoice == 1 && computerChoice == 3 || playerChoice == 2 && computerChoice == 1 || playerChoice == 3 && computerChoice == 2){
                            winCount++;

                        }else if(playerChoice == 3 && computerChoice == 1 || playerChoice == 1 && computerChoice == 2 || playerChoice == 2 && computerChoice == 3){
                            lossCount++;
                        }else{
                            tieCount++;
                        }

                        roundCount--;

                    }

                    
                    if(winCount > lossCount && winCount > tieCount){
                        System.out.println("Contgratulations! You've won! \n");
                        System.out.print("Player's wins: " + winCount+ "\n" + "Computer's wins: " + lossCount + "\n" + "Ties: " + tieCount + "\n");
                    }else if(lossCount > winCount && lossCount > tieCount){
                        System.out.println("Sorry! The computer has won! \n");
                        System.out.print("Player's wins: " + winCount+ "\n" + "Computer's wins: " + lossCount + "\n" + "Ties: " + tieCount + "\n");
                    }else{
                        System.out.println("It was a tie! No one wins! \n");
                        System.out.print("Player's wins: " + winCount+ "\n" + "Computer's wins: " + lossCount + "\n" + "Ties: " + tieCount + "\n");
                    } 
                    
                    
                    System.out.print("Would you like to play again? (Y/N): ");
                    replayChoice=keyboard.next();
                    
                    if(replayChoice.contains("Yes")||replayChoice.contains("yes")||replayChoice.contains("Y")||replayChoice.contains("y")){
                        System.out.println("Great, let's play again!");
                        replay = true;
                    }else{
                        System.out.println("Goodbye!");
                        replay = false;
                    }
                                                            
                }else{
                    System.out.println("Error: cannot have more than 10 or less than zero rounds.");
                    replay = false;
                }
        
        
        }
        
    }
}
