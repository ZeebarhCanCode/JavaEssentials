package org.example;

import java.text.FieldPosition;
import java.text.NumberFormat;
import java.text.ParsePosition;

public class DataStructures {

    //initializing an array 2 dimentsional array
    int [][] numbers = new int[2][3];
    //numbers [0][0] = 1

    public static void main(String [] args){
        DataStructures ds = new DataStructures();
//        final float PI =  3.14F;
//        //PI = 3.45F;
//        int X = 10 + 3 * 2;
//        System.out.println(X);

        //Lesson 13: Casting
        // e.g implicit casting: int num_int = 10;  float num_float = num_int; //the programming language automatically converts to the appropriate data type
        //explicit casting
        //byte > short >int> long > float > double
//        double x = 1.1;
//        int y = (int) x + 2;
//        System.out.println(y);
//
//        String xx = "1";
//        int yyy = Integer.parseInt(xx) + 2;
//        System.out.println(yyy);

        //lesson 15
        //Math.min,  Math.max, Math.random
        double result = (int)Math.round(Math.random() * 100);
        System.out.println(result);

        //Lesson 16: Formatting numbers
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String results = NumberFormat.getPercentInstance().format(0.13345);
        //System.out.println( currency.format(1234567.890));
        System.out.println( "final result is " + results);
      }
//    }
}
