package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter a number and find all Prime Factors: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        System.out.println("Prime factorization of " + number + " is: ");
        while (number % 2 == 0) {
            int two = number / (number / 2);
            System.out.print(two+ " * ");
            number /= 2;

        }

        while (number % 3 == 0) {
            int three = number/(number/3);
            System.out.print(three + " * ");
            number /= 3;

        }

        while (number % 5 == 0) {
            int five = number/(number/5);
            System.out.print(five + " * ");
            number /= 5;

        }
        while(number % 7==0){
            int seven = number/(number/7);
            System.out.print(seven + " * ");
            number/=7;
        }
        if(number == 2 || number == 3 || number == 5 || number ==7){
        System.out.print("is a prime number");
        }
        else{
            System.out.print("1");
        }


    }
}

