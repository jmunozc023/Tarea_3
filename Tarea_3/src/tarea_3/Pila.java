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

    private int vectorPila[];
    private int top;

    public Pila(int tamano) {
        vectorPila = new int[tamano];
        top = 0;
    }

    public boolean pilaVacia() {
        if (top == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean pilaLlena(int tamano) {
        if (top == tamano) {
            return true;
        } else {
            return false;
        }
    }

    public void push(int dato) {
        vectorPila[top] = dato;
        top++;
    }

    public int pop() {
        int eliminar = 0;
        if (top == 0) {
            System.out.println("La pila esta vacia.");
        } else {
            eliminar = vectorPila[top - 1];
            top--;
        }
        return eliminar;
    }

    public void mostrarPila() {
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

    public void extFondo() {
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

    public int tamano() {
        return vectorPila.length;
    }

    public void pasarDatos() {
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
