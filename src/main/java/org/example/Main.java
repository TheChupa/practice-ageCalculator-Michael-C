package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Prompt user to enter their age
        System.out.print("Please enter your age:");
        int age = scanner.nextInt();
        int timeLeft = (100 - age);
        System.out.print("You have " + timeLeft +" years left until you are 100!");

    }
}