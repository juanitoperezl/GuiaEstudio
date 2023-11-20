/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio25;

import java.util.Scanner;

/**
 *
 * @author Jazi ༼ つ ◕_◕ ༽つ
 */
public class Ejercicio25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 Scanner DiasSemana = new Scanner(System.in);

        System.out.print("Ingresa un numero del 1 al 7: ");
        int numero = DiasSemana .nextInt(); 

        String diaSemana;

        switch (numero) {
            case 1:
                diaSemana = "Lunes";
                break;
            case 2:
               diaSemana= "Martes";
                break;
            case 3:
                diaSemana= "Miercoles";
                break;
            case 4:
                diaSemana = "Jueves";
                break;
            case 5:
                diaSemana = "Viernes";
                break;
            case 6:
                diaSemana = "Sabado";
                break;
            case 7:
                diaSemana = "Domingo";
                break;
            default:
                diaSemana = "Numero no valido";
        }

        System.out.println("Hola soy el dia:  " + diaSemana ); 

       DiasSemana .close();
    }
    }
    
