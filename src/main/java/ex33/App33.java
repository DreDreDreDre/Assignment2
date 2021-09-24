package ex33;
import java.util.*;
import java.lang.Math;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Andre Jara
 */

public class App33
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String question;
        int randomNumber = 0 + (int) (Math.random() * ((3 - 0) + 1));
        List<String> responses = new ArrayList<String>();
        responses.add("Yes");
        responses.add("No");
        responses.add("Maybe");
        responses.add("Ask again later");


        System.out.println("What is your question? ");
        System.out.print("> ");
        question = sc.nextLine();

        System.out.println(responses.get(randomNumber));



    }
}
