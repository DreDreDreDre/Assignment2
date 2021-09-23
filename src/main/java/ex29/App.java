package ex29;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Andre Jara
 */

public class App 
{
    public static void main( String[] args )
    {
        String input = "";
        double rate;
        double years;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("What is the rate of return? ");
            input = sc.nextLine();
            if(!input.matches("[0123456789.]+") || input.equals("0"))
            {
                System.out.println("Sorry. That's not a valid input.");
            }
        }while(!input.matches("[0123456789.]+") || input.equals("0"));

        rate = Double.parseDouble(input);
        years = 72/rate;

        System.out.println("It will take " + years + " years to double your initial investment.");
    }
}
