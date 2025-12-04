/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.encontrarnumero;
import java.util.*;

/**
 *
 * @author DAM124
 */
public class EncontrarNumero {
    public static void main(String[] args) {
    int numeroAleatorio, numeroUsuario, intentos = 1;
    Scanner scan = new Scanner(System.in);
    Random rand = new Random();

    numeroAleatorio = rand.nextInt(101); // Genera un número entre 0 y 100

    System.out.println("Adivina el número entre 1 y 100\n");

    do {
        numeroUsuario = scan.nextInt();
        if (numeroUsuario > numeroAleatorio) {
            System.out.println("¡Más bajo!");
        }
        if (numeroUsuario < numeroAleatorio) {
            System.out.println("¡Más alto!");
        }
        if (numeroUsuario == numeroAleatorio) {
            System.out.println("¡Correcto!");
            System.out.println("Has adivinado en " + intentos + " intentos.");
        }

        intentos++;

    } while (numeroUsuario != numeroAleatorio);

    scan.close();
    }
}
