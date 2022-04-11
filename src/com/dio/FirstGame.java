package com.dio;

import java.io.PrintStream;
import java.util.Scanner;

public class FirstGame {
    public static void main(String[] args) {
        /*System.out.println("Hello World !");*/
        PrintStream show = System.out;
        Scanner scan = new Scanner(System.in);

        int option;

        show.println("Hello ! What's you name ?");
        String name = scan.nextLine();
        show.println("Nice to meet you " + name + " !");
        show.println(name + ", do you want to play a game ?");
        show.println("\nPlease choose the number of your choice: \n1 - I want to play \n2 - I don't want to play");
        option = scan.nextInt();
        if (option == 2) {
            show.println("Oh that's to bad, but ok we can play some other time");
        }else if (option == 1) {

            show.println("Let's play then");
            show.println("The game works like this: you're lost in a dark and terrifying forest so you need to escape");
            show.println("Chose a direction to go and if you pick the right choice, you're safe !");
            show.println("You can choose west, east, south or north");
            show.println("Let's begin");
            show.println("Were should you go ?");

            String op = scan.nextLine();

            do {
                op = scan.nextLine();
                if (op.equals("west")) {
                    show.println("Oh no, looks like this path is filled with hungry wolves");
                    show.println("Probably should try a different path");
                } else if (op.equals("east")) {
                    show.println("This seems like a dead end");
                    show.println("Let's go back and try again");
                } else if (op.equals("south")) {
                    show.println("Damn you fell into a hole");
                    show.println("Let's climb and give it another try");
                }


            } while (!op.equals("north"));
            show.println("This seems ok...maybe you're safe ?");
        }
    }
}
