
package ejercicio14;

import java.util.Scanner;

/**
 *
 * @author Jazi ༼ つ ◕_◕ ༽つ
 */
public class Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
  Scanner fichac = new Scanner(System.in);

        System.out.print("Favor de ingresar su nombre completo:");
        String nombreCompleto = fichac.nextLine();

        System.out.print("Favor de ingresar su edad:");
        int edad = fichac.nextInt();
        fichac.nextLine(); 

        System.out.print("Favor de ingresar su correo electronico: ");
        String correoElectronico = fichac.nextLine();

        
        System.out.print("Favor de ingresar su numero de telefono: ");
        String telefono = fichac.nextLine();

        
      fichac.close();

        
        System.out.println("Ficha de Contacto:");
        System.out.println("Nombre Completo: " + nombreCompleto);
        System.out.println("Edad: " + edad + "  Anios ");
        System.out.println("Correo Electronico: " + correoElectronico);
        System.out.println("Telefono: " + telefono);
    }
}  