package ex27;
import java.util.Scanner;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Andre Jara
 */

public class App27
{
    public static int checkName(String name)
    {
        if(name.length() < 2 && !name.equals(""))
        {
            return 1;
        }
        else if(name.length() < 2 && name.equals(""))
        {
            return 2;
        }
        return 0;
    }
    public static int checkZip(String zipInput)
    {
        if(!zipInput.matches("[0123456789]+"))
        {
            return 1;
        }

        return 0;
    }
    public static int checkID(String id)
    {
        if(id.substring(0,1).matches("[ABCDEFGHIJKLMNOPQRSTUVWXYZ]+") && id.charAt(2) == '-' && id.substring(3,6).matches("[0123456789]+") && id.length() == 7)
        {
            return 1;
        }

        return 0;
    }
    public static String validateInput(String firstName, String lastName, String zip, String id)
    {
        int isFirstName;
        int isLastName;
        int isZipcode;
        int isID;

        String firstNameCorrection = "";
        String lastNameCorrection = "";
        String zipcodeCorrection = "";
        String idCorrection = "There were no errors found.";

        isFirstName = checkName(firstName);
        isLastName = checkName(lastName);
        isZipcode = checkZip(zip);
        isID = checkID(id);

        if(isFirstName == 1)
        {
            firstNameCorrection = "The first name must be at least 2 characters long.\n";
        }
        else if(isFirstName == 2)
        {
            firstNameCorrection = "The first name must be at least 2 characters long.\n" + "The first name must be filled in.\n";
        }

        if(isLastName == 1)
        {
            lastNameCorrection = "The last name must be at least 2 characters long.\n";
        }
        else if(isLastName == 2)
        {
            lastNameCorrection = "The last name must be at least 2 characters long.\n" + "The last name must be filled in.\n";
        }

        if(isZipcode == 1)
        {
            zipcodeCorrection = "The zipcode must be a 5 digit number.\n";
        }

        if(isID == 0)
        {
            idCorrection = "The employee ID must be in the format of AA-1234.\n";
        }
        return firstNameCorrection + lastNameCorrection + idCorrection + zipcodeCorrection;
    }
    public static void main(String[] args)
    {
        String firstNameInput = "";
        String lastNameInput = "";
        String zipCodeInput = "";
        String idInput = "";
        String output = "";
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first name: ");
        firstNameInput = sc.nextLine();

        System.out.print("Enter the last name: ");
        lastNameInput = sc.nextLine();

        System.out.print("Enter the ZIP code: ");
        zipCodeInput = sc.nextLine();

        System.out.print("Enter the employee ID: ");
        idInput = sc.nextLine();

        output = validateInput(firstNameInput, lastNameInput, zipCodeInput, idInput);

        System.out.println(output);
    }
}
