package ex30;
import java.lang.String;
import java.util.Scanner;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Andre Jara
 */

public class App
{
    public static void main(String[] args)
    {
        int array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        for(int i = 0; i < 12; i++)
        {
            for(int j = 0; j < 12; j++)
            {
                System.out.printf("%3d ", array[i] * array[j]);
            }
            System.out.println("");
        }
    }
}
