/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package areacirculo;

import java.util.Scanner;

/**
 *
 * @author richard
 */
public class AreaCirculo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

        
        System.out.print("Ingrese el radio del circulo: ");
        
        
        double radio = scanner.nextDouble();
        
       
        double area = Math.PI * Math.pow(radio, 2);
        
        
        System.out.println("El area del circulo con radio " + radio + " es: " + area);

      
        scanner.close();
    }
}