package org.example;
import java.util.Scanner;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Andre Jara
 */

public class App25
{
    public static int passwordValidator(String passInput)
    {
        String string = passInput;
        System.out.println(passInput.length());
        if(string.matches("[0123456789]+") && string.length() < 8)
        {
            return 1;
        }
        else if(string.matches("[abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ]+") && string.length() < 8)
        {
            return 2;
        }
        else if((string.matches(".*[a-z].*") || string.matches(".*[A-Z].*")) && (string.contains("0") || string.contains("1") || string.contains("2") || string.contains("3") || string.contains("4") || string.contains("5") || string.contains("6") || string.contains("7") || string.contains("8") || string.contains("9")) && string.length() >= 8 && !(string.contains("\\") || string.contains("\"") || string.contains("`") || string.contains("~") || string.contains("!") || string.contains("@") || string.contains("#") || string.contains("$") || string.contains("%") || string.contains("^") || string.contains("&") || string.contains("*") || string.contains("(") || string.contains(")") || string.contains("-") || string.contains("_") || string.contains("+") || string.contains("=") || string.contains("{") || string.contains("[") || string.contains("}") || string.contains("]") || string.contains("|") || string.contains(";") || string.contains(":") || string.contains("'") || string.contains("<") || string.contains(",") || string.contains(">") || string.contains(".") || string.contains("?") || string.contains("/")))
        {
            return 3;
        }
        else if((string.matches(".*[a-z].*") || string.matches(".*[A-Z].*")) && (string.contains("0") || string.contains("1") || string.contains("2") || string.contains("3") || string.contains("4") || string.contains("5") || string.contains("6") || string.contains("7") || string.contains("8") || string.contains("9")) && string.length() >= 8 && (string.contains("\\") || string.contains("\"") || string.contains("`") || string.contains("~") || string.contains("!") || string.contains("@") || string.contains("#") || string.contains("$") || string.contains("%") || string.contains("^") || string.contains("&") || string.contains("*") || string.contains("(") || string.contains(")") || string.contains("-") || string.contains("_") || string.contains("+") || string.contains("=") || string.contains("{") || string.contains("[") || string.contains("}") || string.contains("]") || string.contains("|") || string.contains(";") || string.contains(":") || string.contains("'") || string.contains("<") || string.contains(",") || string.contains(">") || string.contains(".") || string.contains("?") || string.contains("/")))
        {
            return 4;
        }
        System.out.println(string.matches("[0123456789]+"));
        return 0;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String passwordInput;
        String passwordDescriptor;
        int passStrength;

        System.out.print("Enter password: ");
        passwordInput = sc.nextLine();
        passStrength = passwordValidator(passwordInput);

        if(passStrength == 1)
        {
            passwordDescriptor = "very weak password.";
        }
        else if(passStrength == 2)
        {
            passwordDescriptor = "weak password.";
        }
        else if(passStrength == 3)
        {
            passwordDescriptor = "strong password.";
        }
        else if(passStrength == 4)
        {
            passwordDescriptor = "very strong password.";
        }
        else
        {
            passwordDescriptor = "error!";
        }

        System.out.println("The password '" + passwordInput + "' is a " + passwordDescriptor);
    }
}
