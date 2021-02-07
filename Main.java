package mydev;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Math
        System.out.println((int) Math.pow(5, 2));
        System.out.println(Math.abs(-55));
        System.out.println(Math.max(6, 10));
        System.out.println(Math.min(6, 10));
        System.out.println(Math.round(2.2));

        // if statement
        int age = 17;
        if (age >= 18) {
            System.out.println("adult");
        } else if (age >= 16 && age < 18){
            System.out.println("almost adult");
        } else {
            System.out.println("no adult");
        }


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

    }
}