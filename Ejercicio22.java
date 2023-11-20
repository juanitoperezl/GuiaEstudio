/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio22;

import java.util.Scanner;

/**
 *
 * @author Jazi ༼ つ ◕_◕ ༽つ
 */
public class Ejercicio22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese cualquier numero (entero) ");
        
        int numero = scanner.nextInt();
        scanner.close();
        
        long factorial = 1;
        
        for (int i = 1; i <= numero; i++) {
            factorial *=i;
            
        }
        System.out.println("El factorial del numero ingresado   " + numero + " es =  " + factorial);
    }
    }