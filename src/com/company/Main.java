package com.company;


import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner message = new Scanner(System.in);
        Random rand = new Random();

    // getting user input
        System.out.println("Enter your message: ");
        String input = message.nextLine();


    // creating key for encryption
        int size = input.length();
        int key = rand.nextInt(size);

    // testing
        System.out.println("Size  " + size);
        System.out.println("Key  " + key);

    }
}
