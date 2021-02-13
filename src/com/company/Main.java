package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print("Введите высоту :");
        int height = new Scanner(System.in).nextInt();
        System.out.print("Введите ширину :");
        int width = new Scanner(System.in).nextInt();
        System.out.print("Введите текст :");
        var str = new Scanner(System.in).nextLine();

        if (str.length() < width-1) {
            for (int i = 0; i < height; i++) {
                for (int j = 0; j < width; j++) {
                    if ((i == 0) || (j == 0) || (i == height - 1) || (j == width - 1)) {
                        System.out.print("*");
                    }
                    else if ((i == ((height - 1) / 2)) && (j >= (width - str.length()) / 2) &&
                            (j <= ((width - str.length()) / 2) + str.length() - 1)) {
                        System.out.print(str.charAt(j - (width - str.length()) / 2));
                    }
                    else System.out.print(" ");
                }
                System.out.println();
            }
        }
        else System.out.println("Ошибка! Текст не помещается в рамку.");
    }
}
