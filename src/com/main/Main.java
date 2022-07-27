package com.main;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int speed = 0;
        boolean direction = true, quit = false;
        String instructions = "Enter 1 to increase speed, 2 to change direction, 3 to leave";
        while(!quit) {
            System.out.println("Fan speed is " + speed + (speed > 0 ? " and it turns " + (direction?"clockwise":"counter-clockwise") : " and it is stopped."));
            System.out.println(instructions);
            String input = scanner.nextLine();
            int value;
            try {
                value = Integer.parseInt(input);
            }catch (NumberFormatException e){
                value = 99;
            }

            switch (value) {
                case 1 -> speed = ++speed % 4;
                case 2 -> direction = !direction;
                case 3 -> {
                    System.out.println("Bye!");
                    quit = true;
                }
                default -> System.out.println("Enter only 1,2 or 3");
            }
        }
    }
}

