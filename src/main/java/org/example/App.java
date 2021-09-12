package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Daniel Guzman
 */
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        String userInput;
        Scanner sc = new Scanner(System.in);

        System.out.println("Is the car silent when you turn the key?");
        userInput = sc.next();
        if(userInput.equals("y")){
            System.out.println("Are the battery terminals corroded?");
            userInput = sc.next();
            if(userInput.equals("y")){
                System.out.println("Clean the terminals and try starting again.");
                System.exit(0);
            }
            else{
                System.out.println("Replace cables and try again.");
                System.exit(0);
            }
        }
        else{
            System.out.println("Does the car make a slicking noise?");
            userInput = sc.next();
            if(userInput.equals("y")){
                System.out.println("Replace the battery.");
                System.exit(0);
            }
            else{
                System.out.println("Does the car crank up but fail to start?");
                userInput = sc.next();
                if(userInput.equals("y")){
                    System.out.println("Check spark plug connections.");
                    System.exit(0);
                }
                else{
                    System.out.println("Does the engine start and then die?");
                    userInput = sc.next();
                    if(userInput.equals("y")){
                        System.out.println("Does you car have fuel injection?");
                        userInput = sc.next();
                        if(userInput.equals("y")){
                            System.out.println("Get it in for service.");
                            System.exit(0);
                        }
                        else{
                            System.out.println("Check to ensure the choke is opening and closing.");
                            System.exit(0);
                        }
                    }
                    else{
                        System.out.println("This should not be possible.");
                        System.exit(0);
                    }
                }
            }
        }

        sc.close();

    }
}