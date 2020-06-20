package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count;
        System.out.println("Enter number of digits:");
        if (scanner.hasNextInt()) {
            count = scanner.nextInt();
            scanner.nextLine();
            int[] introArray = getArray(count);
            System.out.println("The chosen arrays are" + Arrays.toString(introArray));
        } else {
            System.out.println("Invalid input!");
        }
        }
        public static int [] getArray (int number) {
            Scanner scanner = new Scanner(System.in);
            int theArrayLength = number;
            int [] ArrayLength = new int [theArrayLength];
            int defaultNum = number;

            for (int i = 0; i < ArrayLength.length; i++) {
                System.out.println("Enter number" + defaultNum + "of" + number);
                if (scanner.hasNextInt()) {
                    ArrayLength[i] = scanner.nextInt();
                    scanner.nextLine();
                    defaultNum--;
                } else {
                    System.out.println("Invalid input!");
                    break;
                }
            }
            return ArrayLength;
        }
    }
