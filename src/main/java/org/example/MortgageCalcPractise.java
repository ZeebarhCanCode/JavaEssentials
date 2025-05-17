package org.example;

import java.util.Scanner;

public class MortgageCalculator {

    public static void main(String[] args){
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        //pseudocode
        //define the field - principal, rate, interest,
        //variable: result - multiply all
        //use the values gotten or passed in to multiple and get the compound interest as a result

        //TO-DO: Add error handling and conditional to it.

        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter Principal: ");
        int principal = userInput.nextInt();

        System.out.print("Enter Interest rate: ");
        float interestRate = userInput.nextFloat();
        float calculatedInterest = interestRate/PERCENT/MONTHS_IN_YEAR;

        System.out.print("Enter Years: ");
        byte years = userInput.nextByte();
        int paymentPerYear = years * MONTHS_IN_YEAR;

        double mortgageResult = Math.round(principal * (calculatedInterest * Math.pow(1+ calculatedInterest, paymentPerYear * years))/(Math.pow(1 + calculatedInterest, paymentPerYear)));
        System.out.println("Mortgage is: " + mortgageResult);
    }



}
