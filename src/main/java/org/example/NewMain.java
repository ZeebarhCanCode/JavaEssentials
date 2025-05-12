package org.example;

import java.awt.*;
import java.util.Arrays;
import java.util.Date;

public class NewMain {
    public static void main(String [] args){
        //lesson 2
//        int myAge = 30; //storing it computer memory
//        int herAge = myAge;

//        System.out.println(age);
        //Lesson 3: primitive types

//        byte age = 30;
//        long viewsCount = 39_123_456_78L;
//        float price = 10.99F;
//        char letter = 'A';
//        boolean isEligible = true;

        //Lesson 4: Reference types
//        byte age = 30;
//        Date now = new Date();
//        now.setYear(now.getYear()-1);
//        System.out.println(now);

        //Lesson 5: memory location for primitive vs reference types
//        byte x = 1;
//        byte y = x;
//        x =2;
//        Point point1 = new Point(4, 3)
//        Point point2 = point1;
//        point1.x = 8;
//        System.out.println(point2);

        //Lesson 6: String
        String message = "Hello MOSH" + "!";
        String message2 = "C:\\ + ";
        //System.out.println(message.length());
//        System.out.println(message.indexOf("y"));
//        System.out.println(message.replace(" ", ","));
//        System.out.println(message);
//        System.out.println(message.toLowerCase());

        //Lesson 7: Escape characters: \t, \n, \\ ""
//        String message3 = "Hello \"MOSH\"" + "!";
//        String message4 = "C:\twindows\\..";
//        System.out.println(message4);

        //Lesson 8:
        int [] number = {1,2,3,87,5};
        System.out.println(number.length);
        Arrays.sort(number);

//        int [] number = new int[5];
//        number [0] = 1;
//        number [1] = 2;
        Arrays.toString(number);  //class in java for arrays and we use the .dot opertaor to access members of the class
        //System.out.println(number); //gives us the adress of the object in memory
        System.out.println(Arrays.toString(number));
    }

}
