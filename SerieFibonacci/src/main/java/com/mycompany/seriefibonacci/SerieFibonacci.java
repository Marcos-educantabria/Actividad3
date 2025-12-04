/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.seriefibonacci;

/**
 *
 * @author DAM124
 */
import java.util.Scanner;

public class SerieFibonacci {

    public static void main(String[] args) {
        int a = 0, b = 1;
        int c = 0;

        System.out.print("Introduce un número: ");
        Scanner scan = new Scanner(System.in);

        int limite = scan.nextInt();

        while (c < limite) {
            System.out.println(c);
            c = a + b;
            a = b;
            b = c;
        }

        scan.close();
    }
}