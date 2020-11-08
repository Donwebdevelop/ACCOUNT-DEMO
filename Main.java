package com.demo;

import java.util.Scanner;  // Here we have imported a class called Scanner
public class Main {

    public static void main(String[] args) {
        // write your code here
        Account account1=new Account(560000.50);   // we've called function
        // Account - name of class
        // account1  - name of object

        System.out.println("your account has been created. ");
        System.out.println("Your initial balance is :" + account1.josh()); // concatenation
        System.out.println("please enter the  amount you like to withdraw ?:");

        // cin - getting input from the user - console in
        // cout - console out


        Scanner myScanner = new Scanner(System.in); // System.in allows input from the user

        double amnt = myScanner.nextDouble(); // Here we have specified input entered as a double

        System.out.println("You have withdrawn :"+ amnt +"and your balance is :"+account1.withdraw(amnt));

    }


    // myScanner.nextDouble();   this code specifies to intellij the data type of the input



    // When taking input from the user you have to do two things
    // 1. Allow input from the user            Scanner myScanner = new Scanner(System.in);
    // 2. Specify the data type of the input   double amnt = myScanner.nextDouble();









    // new is a keyword
    // new tells intellij to create an object based on the class mentioned


    // int number = 1
    // Account account1 = new Account()

    // Account mentioned first specifies the data type

    // Account mentioned last specifies the base of the class - as in create an account based on this class


    // keyword - a word with functionality








        // Scanner - name of class
        // myScanner - name of object

        // Scanner scanner = new Scanner(System.in);

        // int number





    // account1.withdraw(100)

    // a = b      Store the value of b in a
    // a = b - c  Storage will happen last

    // a = 10
    // b = 7

    // a = a - b  What will happen first is 10 - 7 which is equal to 3
    //            Then value 3 will be stored in a


    // balance = 560000.50

    // account1.withdraw(10000)

    // amount = 10000

    // balance = balance - amount    560000.50 - 10000 which is equal to 550000.50
    //                               then 550000.50 will be stored in balance
















    // parameter is a value that is specified when the function is created

    // parameter and argument at some point hold the same value

    // argument is a value that is provided when the function is called


























    // Function called sum which will return sum
    /*
        public sum(int 3, int 2){

            return 3 + 2;
        }


    */
    // int mysum = sum()








    // Function
    // values
    // Pass values to the function

    // Class holds multiple functions

    // Package hold multiple classes

    // Functions of classes methods
    // Variables of classes attributes


}
