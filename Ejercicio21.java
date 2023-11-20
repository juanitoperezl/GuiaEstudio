/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio21;

import java.util.Scanner;

/**
 *
 * @author Jazi ༼ つ ◕_◕ ༽つ
 */
public class Ejercicio21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner menu = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Bienvenidos  ");
            System.out.println("Tenemos para ofrecerle ");
            System.out.println("1. Tacos de pastor");
            System.out.println("2. Tacos de bistec");
            System.out.println("3. Tacos campechanos");
            System.out.println("4. Tacos de suadero");
            System.out.println("5. Tacos de canasta");
            System.out.println("6. Tacos dorados");
            System.out.println("7. Salir");
            
            
            opcion = menu.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Su orden de tacos al pastor estan listos  ");
                    break;
                case 2:
                    System.out.println("Su orden de tacos de bistec estan listos  ");
                    break;
                case 3:
                    System.out.println("Su orden  de tacos campechanos estan listos ");
                    break;
                case 4:
                    System.out.println("Su orden de tacos de suadero estan listos ");
                    break;
                case 5:
                    System.out.println("Su orden de  tacos de canasta  estan listos ");
                    break;
                case 6:
                    System.out.println("Su orden de tacos dorados  estan listos ");
                    break;
                case 7:
                    System.out.println("Gracias por su preferencia ***Vuelva pronto*** ");
                    break;
                default:
                    System.out.println("Opcion no valida. Por favor, elige una opcion valida.");
                    break;
            }
        } while (opcion != 7);

        menu.close();
    }
}