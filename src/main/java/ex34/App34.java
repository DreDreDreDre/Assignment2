package ex34;
import java.util.*;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Andre Jara
 */

public class App34
{
    public static void main(String[] args)
    {
        String removeEmployee;
        Scanner sc = new Scanner(System.in);
        List<String> names = new ArrayList<String>();
        names.add("John Smith");
        names.add("Jackie Jackson");
        names.add("Chris Jones");
        names.add("Amanda Cullen");
        names.add("Jeremy Goodwin");

        System.out.println("There are " + names.size() + " employees.");

        for(int i = 0; i < names.size(); i++)
        {
            System.out.println(names.get(i));
        }

        System.out.println("");
        System.out.print("Enter an employee name to remove: ");
        removeEmployee = sc.nextLine();
        names.remove(names.indexOf(removeEmployee));
        System.out.println("");

        System.out.println("There are " + names.size() + " employees:");
        for(int i = 0; i < names.size(); i++)
        {
            System.out.println(names.get(i));
        }

    }
}
