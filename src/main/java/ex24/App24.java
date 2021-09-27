package org.example;
import java.util.Locale;
import java.util.Scanner;
import java.lang.String;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Andre Jara
 */

public class App24
{
    public static int IsAnagram(String a, String b)
    {
        int aCharCounter = 0;
        int bCharCounter = 0;

        if(a.length() != b.length())
        {
            return 0;
        }
        else
        {
            a.toLowerCase();
            b.toLowerCase();


            for(int i = 0; i < a.length(); i++)
            {
                for(int k = 0; k < a.length(); k++)
                {
                    if(a.charAt(k) == a.charAt(i))
                    {
                        aCharCounter++;
                    }
                }
                if(!b.contains(Character.toString(a.charAt(i))))
                {
                    return 0;
                }
                else
                {
                    for(int j = 0; j < b.length(); j++)
                    {
                        if(b.charAt(j) == a.charAt(i))
                        {
                            bCharCounter++;
                        }
                    }

                    if(bCharCounter != aCharCounter)
                    {
                        return 0;
                    }
                }
            }
        }
        return 1;
    }
    public static void main( String[] args )
    {
        String firstString;
        String secondString;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two strings and I'll tell you if they are anagrams: ");
        System.out.print("Enter the first string: ");
        firstString = sc.nextLine();

        System.out.print("Enter the second string: ");
        secondString = sc.nextLine();

        if(IsAnagram(firstString, secondString) == 1)
        {
            System.out.println(firstString + " and " + secondString + " are anagrams.");
        }
        else if(IsAnagram(firstString, secondString) == 0)
        {
            System.out.println(firstString + " and " + secondString + " are not anagrams.");
        }
        else
        {
            System.out.println("Comparison failed.");
        }
    }
}
