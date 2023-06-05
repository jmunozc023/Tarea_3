/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea_3;

import java.util.Scanner;

/**
 *
 * @author josep
 */
public class Tarea_3 {
    Scanner scanner = new Scanner(System.in);
    int opcion = 0;
    public void menuPrincipal(){
        do { //Menu principal
            System.out.println("----- MENÚ PRINCIPAL -----");
            System.out.println("1. Inicializar Pila");
            System.out.println("2. Pila Vacía");
            System.out.println("3. Pila Llena");
            System.out.println("4. Push");
            System.out.println("5. Pop");
            System.out.println("6. Mostrar Pila");
            System.out.println("7. ExtFondo");
            System.out.println("8. Pasar datos de una pila a otra pila");
            System.out.println("9. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    // Constructores de clase Cliente
                    
                    break;
                case 2:
                    // Constructores de la clase Meses
                    
                    break;
                case 3:
                    // Constructores de la clase Meses
                    
                    break;
                case 4:
                    // Constructores de la clase Meses
                    
                    break;
                case 5:
                    // Constructores de la clase Meses
                    
                    break;
                case 6:
                    // Constructores de la clase Meses
                    
                    break;
                case 7:
                    // Constructores de la clase Meses
                    
                    break;
                case 8:
                    // Constructores de la clase Meses
                    
                    break;
                case 9:
                    // Opcion de salida del ciclo
                    System.out.println("Saliendo del sistema...");
                    break;
                default: // Opcion en caso de ingresar un valor invalido
                    System.out.println("Opción inválida. Intente nuevamente.");
                    break;
            }
            System.out.println();
        } while (opcion != 3);

    
    }
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
