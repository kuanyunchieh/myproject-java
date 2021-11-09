package com.kuan;

import java.util.Random;
import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Random random = new Random();
        int seceret = random.nextInt(10)+1;
        System.out.println(seceret);
        Scanner scanner = new Scanner(System.in);
        boolean play = true;
        while (play){
            System.out.println("enter a number");
            String s = scanner.next();
            int num = Integer.parseInt(s);
            if (num > seceret){
                System.out.println("Smeller");
            }
            if (num > seceret){
                System.out.println("Smeller");
            }

        }
    }
}
