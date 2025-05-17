package org.example;

import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculatorTwo{

    /**
     * Part 4: Writing Clean Code
     * class fields
     */

    final static byte MONTHS_IN_YEAR = 12;
    final static byte PERCENT = 100;
    Scanner userInput = new Scanner(System.in);


    /**
     * Part 4: Writing Clean Code
     * Main Method
     */

    public static void main(String[] args) {

        //declaring them straight away
        int principal = (int) readNumber("Principal: ", 20, 4500000);
        float annualInterest = (float) readNumber("Interest: ", 1, 3000);
        byte years = (byte) readNumber("Years: ", 1, 50000);

        printMortgage(principal, annualInterest, years);

        printPaymentSchedule(years, principal, annualInterest);

//        Scanner userInput = new Scanner(System.in);
//        double monthlyInterestRate = 0.0d;
//        while(true) {
//            System.out.print("Enter Period: ");
//            years = userInput.nextByte();
//            if (years >=1 && years <= 30)
//                break;
//            System.out.println("Enter a value between 1 and 30");
//        }
//        while(true) {
//            System.out.print("Enter Principal: ");
//            principal = userInput.nextInt();
//            if (principal >=1000 && principal <= 1000000)
//                break;
//            System.out.println("Invalid input. Please enter a number between 1000 and 1000000");
//        }
//        System.out.print("Enter Years: ");
//        byte years2 = userInput.nextByte();
//        int numberOfPayments = years2 * MONTHS_IN_YEAR;
//
//        double mortgageResult = Math.round(principal * (monthlyInterestRate * Math.pow(1+ monthlyInterestRate, numberOfPayments * years))/(Math.pow(1 + monthlyInterestRate, numberOfPayments)));
//        System.out.println("Mortgage is: " + mortgageResult);
    }

    private static void printMortgage(int principal, float annualInterest, byte years) {
        double mortgage = calculateMortgage(principal, annualInterest, years);
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("MORTGAGE CALCULATOR");
        System.out.println("---------------");
        System.out.println("Your monthly payments:  " + mortgageFormatted);
    }

    private static void printPaymentSchedule(byte years, int principal, float annualInterest) {
        System.out.println();
        System.out.println("PAYMENT SCHEDULE");
        System.out.println("------------");
        for (short month = 1; month <= years *MONTHS_IN_YEAR; month++) {
           double balance =  calculateBalance(principal, annualInterest, years, month);
            System.out.println(NumberFormat.getCurrencyInstance().format(balance));
        }
    }


    /** Part 4 Clean Code:
     * This readNumber method is what we want to use to get user input for-Principal, interestRate & year
     *
     */
    public  static double readNumber(String prompt, double min, double max){
        Scanner scanner = new Scanner(System.in);
        double value;
        while(true) {
            System.out.print(prompt);
            value = scanner.nextFloat();
            if(value >= min && value <=max) {
                //monthlyInterestRate = value / PERCENT / MONTHS_IN_YEAR;
                break;
            }
            //System.out.println("Enter an annualInterest between 1 and 30");
        }
        return value;
    }

    /** Part 4 Clean Code:
     * This calculateBalance method is used to calculate the Balance
     * facing an issue which is displaying incorrect payment values . Find out why
     */
    public static double calculateBalance(int principal, float annualInterest, byte years, short numberOfPaymentsMade){
        short numberOfPayments = (short) (years * MONTHS_IN_YEAR);
        float monthlyInterestRate = annualInterest / PERCENT / MONTHS_IN_YEAR;

        double balance = principal * (Math.pow(1 + monthlyInterestRate, numberOfPayments) - (Math.pow(1 + monthlyInterestRate, numberOfPaymentsMade))
        / (Math.pow(1 + monthlyInterestRate, numberOfPayments) - 1));
        return balance;
    }

    /** Part 4 Clean Code:
     * This calculateMortgage method is used to calculate the Mortgage
     *
     */
    public static double calculateMortgage(int principal, float annualInterest, byte years) {
        short numberOfPayments = (short) (years * MONTHS_IN_YEAR);
        float monthlyInterestRate = annualInterest / PERCENT / MONTHS_IN_YEAR;

        double mortgage = principal * (monthlyInterestRate * Math.pow(1+ monthlyInterestRate, numberOfPayments * years)/(Math.pow(1 + monthlyInterestRate, numberOfPayments)));
        return mortgage;

    }
}
