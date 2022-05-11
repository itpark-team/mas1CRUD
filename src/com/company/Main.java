package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int min = 30, max = 70;
        Random random = new Random();

        System.out.print("input count elements: ");
        int masCount = scanner.nextInt();

        int[] mas = new int[masCount];

        //CRUD

        //C - CREATE
//        for (int i = 0; i < mas.length; i++) {
//            mas[i] = random.nextInt(max - min + 1) + min;//30 70
//        }

        //C - CREATE
        for (int i = 0; i < mas.length; i++) {
            System.out.print("input current elem #" + i + ": ");
            mas[i] = scanner.nextInt();
        }

        //R - RETRIEVE
        System.out.println("output mas:");
        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + " ");
        }
        System.out.println();

        //U - UPDATE
        //mas[0] *= 2;
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] < 40) {
                mas[i] = mas[i] + 5;
            }
        }

//        for (int i = 2; i < 10; i++) {
//            mas[i] *= 2;
//        }

//        System.out.println("output mas:");
//        for (int i = 2; i < 10; i++) {
//            System.out.print(mas[i] + " ");
//        }

        //R - RETRIEVE
        System.out.println("output mas:");
        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + " ");
        }
        System.out.println();

        //D - DELETE
        mas[1] = -1;

        //R - RETRIEVE
        System.out.println("output mas:");
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] != -1) {
                System.out.print(mas[i] + " ");
            }
        }
        System.out.println();

        //R - RETRIEVE
        System.out.println("output mas:");
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] % 2 == 0) {
                System.out.print(mas[i] + " ");
            }
        }
        System.out.println();


    }
}
