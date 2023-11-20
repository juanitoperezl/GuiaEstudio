/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tablamultiplicacion;

import java.util.Scanner;

/**
 *
 * @author Jazi ༼ つ ◕_◕ ༽つ
 */
public class TablaMultiplicacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner TabMultiplicacion = new Scanner(System.in);

        System.out.print(" Eliga un numero del 1 al 10: ");
        int numero = TabMultiplicacion.nextInt();

        System.out.println("La tabla de multiplicar del numero que eligio " + numero + " es: ");
        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }

        TabMultiplicacion.close();
    }   
    
    
}

