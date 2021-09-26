package ex38;
import java.util.*;
import java.lang.String;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Andre Jara
 */

public class App38
{
    public static double[] filterEvenNumbers(double[] nums)
    {
        int numEvens = 0;
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] % 2 == 0)
            {
                numEvens++;
            }
        }

        double[] evenNums = new double[numEvens];
        int j = 0;
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] % 2 == 0)
            {
                evenNums[j] = nums[i];
                j++;
            }
        }
        return evenNums;
    }
    public static void main(String[] args)
    {
        String numbers;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a list of numbers, separated by spaces: ");
        numbers = sc.nextLine();

        String[] array = numbers.split(" ");
        double[] arrayNum = new double[array.length];
        double[] evenNums;
        for(int i = 0; i < array.length; i++)
        {
            arrayNum[i] = Double.parseDouble(array[i]);
        }

        evenNums = filterEvenNumbers(arrayNum);

        System.out.print("The even numbers are ");
        for(int i = 0; i < evenNums.length; i++)
        {
            System.out.print(evenNums[i]);
            if(i != evenNums.length - 1)
            {
                System.out.print(", ");
            }
        }
    }
}
