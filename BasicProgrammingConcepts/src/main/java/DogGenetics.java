


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

public class DogGenetics {
    
    public static void main(String[] args){

        Scanner keyboard = new Scanner(System.in);
        String dogName="";

        System.out.print("What is your dog's name: ");
        dogName=keyboard.nextLine();
    
        System.out.println("Well then, I have this highly reliable report on "+ dogName +"'s prestigious background right here."+"\n");
        System.out.println(dogName+" is:"+ "\n");
        
        geneCalc();
       
    
    }    
    
    public static void geneCalc(){
         String[] breeds = {"St. Bernard", "Chihuahua", "Dramatic RedNose Asian Pug", 
                           "Common Cur", "King Doberman"};
                           
          int min=1;
          int max=100;
          int hundo=100;
          int sum=0;
          
          int lastValue=0;
          int[] arr=new int[5];
          
          
          for(int i=0;i<breeds.length;i++){
              if(i!=arr.length-1){   
                 arr[i]=(int)((Math.random()*(max-min))+min);
                 
                 sum+=arr[i];
                 max-=arr[i];       
              }else{
                  lastValue=hundo-sum;
                  arr[i]=lastValue;
               }
          }                 
    
          for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+"% "+breeds[i]);
          }
          System.out.println("\n"+"Wow, that's QUITE the dog!");
    }
    
}

