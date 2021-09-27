package org.example;
import java.lang.Math;
import java.util.Scanner;
import java.math.BigDecimal;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Andre Jara
 */
public class App26
{
    public static void main( String[] args )
    {
        PaymentCalculator pay = new PaymentCalculator();
        Scanner sc = new Scanner(System.in);
        double balance;
        double aprInput;
        double apr;
        double monthlyPayment;
        int numMonths;

        System.out.print("What is your balance? ");
        balance = sc.nextDouble();

        System.out.print("What is the APR on the card (as a percent)? ");
        aprInput = sc.nextDouble();
        apr = aprInput/100;

        System.out.print("What is the monthly payment you can make? ");
        monthlyPayment = sc.nextDouble();

        numMonths = pay.calculateMonthsUntilPaidOff(balance, apr, monthlyPayment);
        System.out.println("It will take you " + numMonths + " months to pay off this card.");
    }
}
class PaymentCalculator
{
    public int calculateMonthsUntilPaidOff(double bal, double apr, double monthlyPayment)
    {
        int numMonths = -1;
        double numberMonths;
        numberMonths = (-1.0/30.0) * (Math.log(1 + (bal/monthlyPayment) * (1-Math.pow(1+(apr/365.0),30))) / Math.log(1 + (apr/365.0)));
        numMonths = (int) Math.ceil(numberMonths);
        return numMonths;
    }
}