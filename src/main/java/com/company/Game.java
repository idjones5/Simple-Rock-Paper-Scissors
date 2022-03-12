package com.company;

import java.util.Random;
import java.util.Scanner;


public class Game {

    // function that compares two parameters to determine the end result of the game
    public static void compAgainstUserChoice(String compAnswer, String userChoice) {
        if (compAnswer.equals(userChoice)) {
            System.out.println("It's a draw!");
        } else if (compAnswer.equals("rock") && userChoice.equals("paper") || compAnswer.equals("paper") && userChoice.equals("scissors") || compAnswer.equals("scissors") && userChoice.equals("rock")) {
            System.out.println("Congratulations, you win!");
        } else if (compAnswer.equals("paper") && userChoice.equals("rock") || compAnswer.equals("scissors") && userChoice.equals("paper") || compAnswer.equals("rock") && userChoice.equals("scissors")) {
            System.out.println("Sorry, you lose ):");
        }
    }

    // function for later error input
    public static void errorNotAChoice() {
            System.out.println("Invalid argument. Please enter: rock, paper, or scissors.");
    }

    public static void main(String[] args) {
        // Game that checks for a win lose or draw that randomly selects either rock, paper, or scissors

        // instantiating the random object and making a copy that I named ranny (: so I can use it.
        Random ranny = new Random();
        Scanner scan = new Scanner(System.in);

        // shorthand initialization of an array that will hold the computer answer options
        String[] computerArr = {"rock", "paper", "scissors"};

        int compArrIndex = ranny.nextInt(computerArr.length); // generating a random position in the array

        String compAnswer = computerArr[compArrIndex]; // setting the computer answer to a randomly selected index in the array
        // System.out.println(compAnswer);

        System.out.println("Welcome!");
        System.out.println("Please enter rock, paper, or scissors:");

        String userAnswer = scan.nextLine();
        String userChoice = userAnswer;

        System.out.println("You entered: " + userChoice + " is this correct? Enter y or n");
        userAnswer = scan.nextLine();

        while (userAnswer.equals("n")) {
            System.out.println("Enter rock, paper, or scissors");
            userAnswer = scan.nextLine();
            String answer = userChoice;
            System.out.println("You entered: " + userAnswer + " is this correct? Enter y or n");
            userAnswer = scan.nextLine();
            if (userAnswer.equals("y")) {
                answer = userChoice;
                // System.out.println(answer);
                }
            }

        compAgainstUserChoice(compAnswer, userChoice);
        System.out.println("\nComputer: " + compAnswer);
    }
}
