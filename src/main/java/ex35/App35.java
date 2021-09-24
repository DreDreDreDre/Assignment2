package ex35;
import java.util.*;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Andre Jara
 */

public class App35
{
    public static void main(String[] args)
    {
        String input = "";
        int numNames = -1;
        int winnerIndex;
        Scanner sc = new Scanner(System.in);
        List<String> names = new ArrayList<String>();
        do
        {
            System.out.print("Enter a name: ");
            input = sc.nextLine();
            if(!input.equals(""))
            {
                names.add(input);
                numNames++;
            }
        }while(!input.equals(""));

        winnerIndex = 0 + (int) (Math.random() * ((numNames - 0) + 1));

        System.out.println("The winner is... " + names.get(winnerIndex));
    }
}
