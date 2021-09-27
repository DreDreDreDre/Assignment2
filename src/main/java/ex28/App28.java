package ex28;

import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Andre Jara
 */

public class App28
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double sum = 0;
        for(int i = 0; i < 5; i++)
        {
            System.out.print("Enter a number: ");
            sum = sum + sc.nextDouble();
        }
        System.out.println("The total is " + sum);
    }
}
