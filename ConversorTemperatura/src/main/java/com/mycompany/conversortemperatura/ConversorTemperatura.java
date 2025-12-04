/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.conversortemperatura;
import java.util.Scanner; 

/**
 *
 * @author DAM124
 */
public class ConversorTemperatura {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("\n\tBienvenido al Conversor de Temperaturas\n");

        System.out.print("Introduce el valor que deseas convertir: ");
        float value = scan.nextFloat();

        System.out.println("  Pulsa 1 para convertir de Celsius a Fahrenheit");
        System.out.println("  Pulsa 2 para convertir de Fahrenheit a Celsius");
        System.out.print("\nIntroduce tu opción: ");
        int ans = scan.nextInt();

        if (ans == 1) {
            float value1 = (float) ((value * 1.8) + 32);
            System.out.print("La conversión es: " + value1 + " °F");
        }

        if (ans == 2) {
            float value2 = value - 32;
            float value3 = (value2 * 5) / 9;
            System.out.print("La conversión es: " + value3 + " °C");
        }

        System.out.println("\n\t¡Gracias por usar el conversor!");
        scan.close();
    }
}

