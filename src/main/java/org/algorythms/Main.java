package org.algorythms;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        HanoiTower program = new HanoiTower();

        Scanner myNumber = new Scanner(System.in);
        System.out.println("Enter number you want to check:");
        int chargedNumber = myNumber.nextInt();

        System.out.println("Enter the number you will compare with the previous one:");
        int exemplaryNumber = myNumber.nextInt();
        Powers test = new Powers();
        String truth = test.check(chargedNumber, exemplaryNumber);

        System.out.println(truth);
    }
}