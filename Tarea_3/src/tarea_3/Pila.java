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
    public Pila(int tamano){
        vectorPila= new int[tamano];
        top=0;
    }
    public boolean pilaVacia(){
        if (top==0) {
            return true;
        } else {
            return false;
        }
    }
    public boolean pilaLlena(int tamano){
        if (top==tamano) {
            return true;
        } else {
            return false;
        }
    }
    public void push(int dato){
        vectorPila[top]=dato;
        top++;
    }
    public int pop(){
        int eliminar =0;
        if (top==0) {
            System.out.println("pila vacia");
        } else {
            eliminar = vectorPila[top-1];
            top--;
        }
        return eliminar;
    }
    public void mostrarPila(){
        while (pilaVacia()==false) {
            int aux= pop();
            System.out.println(aux);
        }
    }
    public void extFondo(){
        int aux=0;
        while (pilaVacia()==false) {
            aux= pop();
        }
        System.out.println(aux);
    }
    public int tamano(){
        return vectorPila.length;
    }
    public void pasarDatos(){
        int aux=0;
        Pila pilaDos= new Pila(tamano());
        while (pilaVacia()==false) {
            aux= pop();
            if (pilaDos.pilaLlena(tamano())==false) {
                pilaDos.push(aux);
            } else {
                System.out.println("Esta llena");
            }
        }
    }
}
