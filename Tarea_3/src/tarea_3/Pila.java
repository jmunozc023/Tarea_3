/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea_3;

/**
 *
 * @author josep
 */
public class Pila {

    private int vectorPila[]; //Variable de la pila
    private int top; //Variable de la cabeza de la pila

    public Pila(int tamano) { //Constructos de la pila
        vectorPila = new int[tamano];
        top = 0;
    }

    public boolean pilaVacia() { //Metodo para indicar si la pila esta vacia
        if (top == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean pilaLlena(int tamano) { //Metodo para indicar si la pila esta llena
        if (top == tamano) {
            return true;
        } else {
            return false;
        }
    }

    public void push(int dato) { //Metodo Push de la pila
        vectorPila[top] = dato;
        top++;
    }

    public int pop() { //Metodo Pop de la pila
        int eliminar = 0;
        if (top == 0) {
            System.out.println("La pila esta vacia.");
        } else {
            eliminar = vectorPila[top - 1];
            top--;
        }
        return eliminar;
    }

    public void mostrarPila() { //Metodo Mostrar pila sin perder los datos originales
        int aux = 0;
        Pila pilaBackup = new Pila(tamano());
        while (pilaVacia() == false) {
            aux = pop();
            System.out.println(aux);
            if (pilaBackup.pilaLlena(tamano()) == false) {
                pilaBackup.push(aux);
            } else {
                System.out.println("Backup listo.");
            }
        }
        while (pilaBackup.pilaVacia() == false) {
            aux = pilaBackup.pop();
            push(aux);
        }
    }

    public void extFondo() { //Metodo para mostrar el valor del fondo
        int aux = 0;
        Pila pilaBackup = new Pila(tamano());
        while (pilaVacia() == false) {
            aux = pop();
            if (pilaBackup.pilaLlena(tamano()) == false) {
                pilaBackup.push(aux);
            } else {
                System.out.println("Backup listo.");
            }
        }
        System.out.println(aux);
        while (pilaBackup.pilaVacia() == false) {
            aux = pilaBackup.pop();
            push(aux);
        }
    }

    public int tamano() { //Metodo para definir el tamaño de la pila
        return vectorPila.length;
    }

    public void pasarDatos() { //Metodo para pasar los datos de una pila a otra sin perderlos
        int aux = 0;
        Pila pilaDos = new Pila(tamano());
        while (pilaVacia() == false) {
            aux = pop();
            if (pilaDos.pilaLlena(tamano()) == false) {
                pilaDos.push(aux);
            } else {
                System.out.println("La pila esta llena.");
            }
        }
        while (pilaDos.pilaVacia() == false) {
            aux = pilaDos.pop();
            System.out.println(aux);
            push(aux);
        }
    }
}
