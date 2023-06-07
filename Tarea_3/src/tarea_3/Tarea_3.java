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
    int tamano = 0;
    private int vectorPila[];
    Pila pila; 
    public void inicializarPila() {
        System.out.println("Indique el tamaño de la pila");
        tamano = scanner.nextInt();
        pila = new Pila(tamano);
    }

    public void menuPrincipal() {
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
                    inicializarPila();
                    break;
                case 2:
                    // Constructores de la clase Meses
                    if (pila.pilaVacia()== true) {
                        System.out.println("La pila esta vacia. ");
                    } else {
                        System.out.println("La pila no esta vacia.");
                    }
                    break;
                case 3:
                    // Constructores de la clase Meses
                    if (pila.pilaLlena(tamano)==true) {
                        System.out.println("La pila esta llena. ");
                    } else {
                        System.out.println("La pila no esta llena.");
                    }
                    break;
                case 4:
                    // Constructores de la clase Meses
                    int dato=0;
                    System.out.println("Ingrese el valor que desea ingresar a la pila: ");
                    dato= scanner.nextInt();
                    pila.push(dato);
                    break;
                case 5:
                    // Constructores de la clase Meses
                    System.out.println("El valor eliminado es: "+ pila.pop());
                    break;
                case 6:
                    // Constructores de la clase Meses
                    pila.mostrarPila();
                    break;
                case 7:
                    // Constructores de la clase Meses
                    pila.extFondo();
                    break;
                case 8:
                    // Constructores de la clase Meses
                    pila.pasarDatos();
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
        } while (opcion != 9);

    }

    public static void main(String[] args) {
        Tarea_3 tarea3 = new Tarea_3();
        tarea3.menuPrincipal();
    }

}
