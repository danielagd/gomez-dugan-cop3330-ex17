package org.example;
import java.util.Scanner;
/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Daniela Gomez-Dugan
 */
public class BloodAlcoholCalculator
{
    public static void main( String[] args )
    {
        // Program to calculate user's blood alcohol content (bac)
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a 1 if you are male or a 2 if you are female: ");
        int gender = input.nextInt();

        System.out.print("How many ounces of alcohol did you have? ");
        double ounces = input.nextDouble();

        System.out.print("What is your weight in pounds? ");
        int weight = input.nextInt();

        System.out.print("How many hours has it been since your last drink? ");
        int hours = input.nextInt();

        // Empty line
        System.out.println("");

        double bac = calculateBAC(gender, ounces, weight, hours);

        String prompt = bac >= 0.08 ? "It is not legal for you to drive." : "It is legal for you to drive.";

        System.out.printf("Your BAC is %.6f\n", bac);
        System.out.print(prompt);
    }

    // Function to calculate the bac
    public static double calculateBAC(int gender, double A, int W, int H)
    {
        double r = gender == 1 ? 0.73 : 0.66;
        double bac = (A * 5.14 / W * r) - .015 * H;
        return bac;
    }

}
