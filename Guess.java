//Author: Jameson Pierre-Louis
//This Program has a user guess a random number between 1-100 and will respond accordingly if the answer is between +-10

package com.ss.apr.jb.one;
import java.util.Random;
import java.util.Scanner;


public class Guess {

	//This function checks for an integer input
	public static int inputValue() {
		
		Scanner scan = new Scanner(System.in);
		int input;
		System.out.print("Please Guess a number: ");
		//Error checking for an integer
		while(!scan.hasNextInt()) {
			System.out.println("Invalid number, try again");
			System.out.print("Please Guess a number: ");
			scan.nextLine();//Flush out invalid number
		}
		input = scan.nextInt();
		
		return input;
	}
	
	
	public static void main(String[] args) {
		
		Random rand = new Random();
		int r = rand.nextInt(100) + 1; //Generates random values between 1 & 100
		System.out.println("Welcome to the Random Number Guess \nPlease Guess a number between 1-100\n");
		int input = inputValue();
		
		//This loop processes the input guess
		for (int i = 0; i < 4; ++i) {
			//Correct number
			if (input == r) {
				System.out.println("Your Guess " + input + " is right on the money!");
				return;
			}
			//Within 10
			else if(input >= (r - 10) && input <= (r + 10)) {
				System.out.println("Your guess was within 10");
				System.out.println("Correct answer: " + r);
				return;
			}
			else if(input > 100 || input < 0) {
				System.out.println("Your guess was out of bounds!");
			}
			//Incorrect with tries remaining
			System.out.println("Incorrect Guess, please try again " + (4 - i) + " Attempts remaining");
			input = inputValue();
		}
		System.out.println("Sorry, you've guessed incorrectly too many times, the correct answer was " + r);
	}

}
