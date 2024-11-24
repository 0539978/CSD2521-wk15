/*
Author: Gillian Harris
Date: 11/19/2024
Description: Hangman Game
*/
// add a comment of your choice to the top of your code file


import java.util.Scanner;

public class HangmanApp {

    public static void main(String[] args) {
        System.out.println("Play the H A N G M A N game");
        
        Scanner sc = new Scanner(System.in);        
        String again = "y";        
        while(again.equalsIgnoreCase("y")) {
            var hangman = new Hangman();
            hangman.drawHangman(7);
            hangman.playGame();
            System.out.println();
            System.out.print("Play again? (y/n): ");
            again = sc.nextLine();
        }
    } 
}