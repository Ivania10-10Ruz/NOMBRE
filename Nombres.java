/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */


package com.mycompany.nombres;
import java.util.Scanner;
/**
 *
 * @author Graciela
 */
public class Nombres {

     public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Crear un arreglo para almacenar 10 nombres
        String[] nombres = new String[10];

        // Solicitar al usuario que ingrese los nombres uno por uno
        for (int i = 0; i < nombres.length; i++) {
            System.out.print("Por favor, introduce el nombre del compañero " + (i + 1) + ": ");
            nombres[i] = scanner.nextLine();  // Leer el nombre y guardarlo en el arreglo
        }

        // Imprimir los nombres del arreglo
        System.out.println("\nNombres de tus compañeros de clase:");
        for (int i = 0; i < nombres.length; i++) {
            System.out.println((i + 1) + ". " + nombres[i]);
        }
    }
}
