/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControlStructures;

import java.util.Scanner;

/**
 *
 * @author jacob.holland
 */
public class MightWeBeFriends2 {
    
    public static void main(String[] args){
        //hard-coded response to question 1
        Scanner scan = new Scanner(System.in);
        //read an integer from the next user
        int RESPONSE_SPORTS =1;
        int responseSports;
        int RESPONSE_MOVIES =1;
        int RESPONSE_MUSIC =1;
        //Compatability score: this variable will be adjusted based on
        //the user's response to questions
        int compScore = 0;
        
        System.out.println("Welcome to my program!");
        System.out.println("Do you watch sports?(0 = no, 1 = yes)");
        
        //TODO: wire up actual user input when logic works
        responseSports = scan.nextInt();
        //once we have the response saved,implement our decison logic
        if(responseSports == 1){
            compScore = compScore + 10;
            System.out.println("Great! My favortire sport is Football");
        } else { 
            System.out.println("That's a shame");
            compScore = compScore + 0;
        }
        //Closes Sports If 
        //TODO: wire up actual user input when logic works 
        System.out.println("Do you like to watch movies?(0 = no, 1 = yes)");
        RESPONSE_MOVIES = scan.nextInt();
        if(RESPONSE_MOVIES == 1){
            System.out.println("Excellent");
            compScore=compScore + 10;
        } else { 
            System.out.println("That's a shame");
            compScore = compScore + 0;
        }
        
        System.out.println("Do you listen to music?(0 = no, 1 = yes)");
        RESPONSE_MUSIC = scan.nextInt();
        //TODO: wire up actual user input when logic works 
        // once we have the response saved, implement our decsion logic. 
       if (RESPONSE_MUSIC == 1){
           compScore = compScore + 10;
           System.out.println("Great, I like to listen to music too.");    
       } else {
           System.out.println("Thats okay");
       }
        //lots more questions
        
        // final check of compatibility score
        if(compScore > 5){
            System.out.println("Great, we might be friends");
            System.out.println("Our match score is: "+compScore+" points");
            
        } else{
            System.out.println("Yikes,according to my decison tree," +
                    "We probably wouldn't make good freinds.");
            System.out.println("Our match score is: "+compScore);
        }//end of if/else blocks
    }// close main
}// close class
