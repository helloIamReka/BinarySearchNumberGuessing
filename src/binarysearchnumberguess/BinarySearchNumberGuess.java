
package binarysearchnumberguess;

import java.io.IOException;
import java.util.Scanner;


public class BinarySearchNumberGuess {
        int theNum, guess, min, max, guessCounter;
        
        public BinarySearchNumberGuess(int theNum) {
        min = 1;
        max = 100;
        guessCounter = 1;
        }
        
        public int guess(int theNum) {
            do {
                guess = (min + max) / 2;
                System.out.println(guessCounter + ". Guess: " + guess);
                if (guess > theNum) {
                    System.out.println("Too high. Searching lower.");
                    max = guess;
                }
                else if (guess < theNum) {
                    System.out.println("Too low. Searching higher.");
                    min = guess;
                }
                guessCounter++;
            }
            while (guess != theNum);
            return guess;
        }
        
    public static void main(String[] args) {
        int theNum;
        Scanner scan = new Scanner(System.in); 
        do {System.out.println("Give me a number between 1 and 100.");
        theNum=(int)scan.nextInt();
        }
        while (!(theNum > 1 && theNum < 100));
    
    
        BinarySearchNumberGuess searchNumber = new BinarySearchNumberGuess(theNum);
        searchNumber.guess(theNum);
        }
}
