package mydev;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Math
        System.out.println((int) Math.pow(5, 2));
        System.out.println(Math.abs(-55));
        System.out.println(Math.max(6, 10));
        System.out.println(Math.min(6, 10));
        System.out.println(Math.round(2.2));

        // -----------------------------------------------------------

        // if statement
        int age = 17;
        if (age >= 18) {
            System.out.println("adult");
        } else if (age >= 16 && age < 18){
            System.out.println("almost adult");
        } else {
            System.out.println("no adult");
        }

        // -----------------------------------------------------------

        // Switch statement
        String gender = "FEMALE";
        switch (gender.toUpperCase()) {
            case "FEMALE":
                System.out.println("the gender is FEMALE");
                break;
            case "MALE":
                System.out.println("the gender is MALE");
                break;
            default:
                System.out.println("the gender is not recognized!");
                break;
        }

        // -----------------------------------------------------------

        // Arrays
        // a int array
        int[] numbers = new int[2];
        numbers[0] = 0;
        numbers[1] = 1;
        //[I@76ccd017
        System.out.println(numbers);
        //[0, 1]
        System.out.println(Arrays.toString(numbers));

        // a String array
        String[] names = new String[3];
        names[0] = "david";
        names[1] = "daniel";
        names[2] = "mike";
        //[Ljava.lang.String;@182decdb
        System.out.println(names);
        //[david, daniel, mike]
        System.out.println(Arrays.toString(names));

        // fast way to pass values to the array using curly brackets
        int[] box = {1, 2, 3};
        System.out.println(Arrays.toString(box));

        // -----------------------------------------------------------

        // -- && ++ 
        int a = 0;
        a ++;
        System.out.println(a); // 1

        // increase after substitution
        int b = a ++; 
        System.out.println(b); // 1 
        System.out.println(a); // 2

        // increase before substitution
        int c = ++ a;
        System.out.println(c); // 3
        System.out.println(a); // 2

         // -----------------------------------------------------------
        
         // for loop
         /* syntax
         for (initial_value; condition_judgement; what_to_to_after_one_run) {
             some_action;
         }
         */

         // normal use (the printout will be 0 to 9)
         for (int x = 0; x < 10; x++) {
             System.out.println(x);
         }

         // how to loop elements in Array (this will printout all the elements of the member array)
         String[] members = {"Maria", "Jack", "Steve"};
         for (String memeber: members) {
             System.out.println(memeber);
         }

         // introduction of break and continue 
            //(this will only printout "Maria")
         for (String memeber_: members) {
             if (memeber_.equals("Jack")) {
                break;
             }
             System.out.println(memeber_);
         }
            //this will skip "Jack" only
         for (String memeber__: members) {
            if (memeber__.equals("Jack")) {
                continue;
             }
             System.out.println(memeber__);
         }

         // -----------------------------------------------------------

         // while loop
         // the case below will cause a endless loop for no stop condition given.
        //  while (true) {
        //      System.out.println("hi!");
        //  }
         // a normal case
         int times = 1;
         while (times <= 20) {
             System.out.println(times + " runs");
             times ++;
         }

         // do while statement
         int y = 0;
         do {
            System.out.println("The first time will be conducted even if the condition is not satisfield");
         } while (y > 0);


        // -----------------------------------------------------------
        //take user's input from console using Scanner
        // make a scanner
        Scanner scanner = new Scanner(System.in);
        // ask user to give name
        System.out.println("Hi! What is your name?");
        // console will wait for the user to input username
        // after the name given, substitution will be performed.
        String username = scanner.nextLine();
        // Say hello to the user
        System.out.println("hello " + username + ", welcome to my world!");
        
        // -----------------------------------------------------------
        // user defined method use
        int countO = countOccurences();
        System.out.println(countO);
    }

    /* user-defined method
    public --- means this method can be accessd by any class
    static --- means this method belongs to a class
    int (ex) --- return type of this method
    */
    public static int countOccurences() {
        return 0;
    }
}