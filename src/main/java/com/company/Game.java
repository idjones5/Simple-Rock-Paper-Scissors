package com.company;

import java.util.Random;
import java.util.Scanner;

public class Game {
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
            System.out.println("You entered: " + userAnswer + " is this correct? Enter y or n");
            userAnswer = scan.nextLine();
            userChoice = userAnswer;
        }

        if (compAnswer.equals(userChoice)) {
            System.out.println("It's a draw!");
        } else if (compAnswer.equals("rock") && userChoice.equals("paper") || compAnswer.equals("paper") && userChoice.equals("scissors")) {
            System.out.println("Congratulations, you win!");
        } else if (compAnswer.equals("paper") && userChoice.equals("rock") || compAnswer.equals("scissors") && userChoice.equals("paper")) {
            System.out.println("Sorry, you lose ):");
        }

        System.out.println("\nComputer: " + compAnswer);
    }
}
