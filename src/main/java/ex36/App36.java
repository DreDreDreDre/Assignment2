package ex36;
import java.util.*;
import java.lang.Math;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Andre Jara
 */

public class App36
{
    public static double average(double[] times)
    {
        double sum = 0;
        double average = 0;
        for(int i = 0; i < times.length; i++)
        {
            sum = sum + times[i];
        }
        average = sum/times.length;
        return average;
    }
    public static double max(double[] times)
    {
        double max = times[0];
        for(int i = 0; i < times.length; i++)
        {
            if(times[i] > max)
            {
                max = times[i];
            }
        }
        return max;
    }
    public static double min(double[] times)
    {
        double min = times[times.length - 1];
        for(int i = 0; i < times.length; i++)
        {
            if(times[i] < min)
            {
                min = times[i];
            }
        }
        return min;
    }
    public static double std(double[] times)
    {
        double std = 0;
        double mean = average(times);
        double summation = 0;
        double root;
        for(int i = 0; i < times.length; i++)
        {
            summation = summation + Math.pow(times[i] - mean, 2);
        }

        root = summation/times.length;
        std = Math.pow(root, 0.5);

        return std;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        List<Double> times = new ArrayList<Double>();
        double inputConv;
        String input = "";
        do
        {
            do
            {
                System.out.print("Enter a number: ");
                input = sc.nextLine();
                if(!input.matches("[0123456789]+") && !input.equals("done"))
                {
                    System.out.print("Invalid input. ");
                }
            }while(!input.matches("[0123456789]+") && !input.equals("done"));
            if(!input.equals("done"))
            {
                inputConv = Double.parseDouble(input);
                times.add(inputConv);
            }
        }while(!input.equals("done"));

        double[] time = new double[times.size()];

        for(int i = 0; i < times.size(); i++)
        {
            time[i] = times.get(i);
        }

        System.out.print("Numbers: ");

        for(int i = 0; i < time.length; i++)
        {
            System.out.print(time[i]);
            if(i != time.length - 1)
            {
                System.out.print(", ");
            }
        }
        System.out.println("");

        System.out.println("The average is " + average(time));
        System.out.println("The minimum is " + min(time));
        System.out.println("The maximum is " + max(time));
        System.out.println("The standard deviation is " + std(time));
    }
}
