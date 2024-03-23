package edu.ejercicios;

public class CicloListaEnlazada {
    public boolean tieneCiclo(NodoLista cabeza) {
        if (cabeza == null || cabeza.siguiente == null) {
            return false;
        }

        NodoLista lento = cabeza;
        NodoLista rapido = cabeza.siguiente;

        while (rapido != null && rapido.siguiente != null) {
            if (lento == rapido) {
                return true;
            }
            lento = lento.siguiente;
            rapido = rapido.siguiente.siguiente;
        }

        return false;
    }

    public void ejemplo1() {
        NodoLista cabeza = new NodoLista(3);
        NodoLista nodo2 = new NodoLista(2);
        NodoLista nodo3 = new NodoLista(0);
        NodoLista nodo4 = new NodoLista(-4);
        cabeza.siguiente = nodo2;
        nodo2.siguiente = nodo3;
        nodo3.siguiente = nodo4;
        nodo4.siguiente = cabeza.siguiente; // Ciclo
        boolean resultado = tieneCiclo(cabeza);
        System.out.println("Output Ejemplo 1: " + resultado); // Output: true
    }

    public void ejemplo2() {
        NodoLista cabeza = new NodoLista(1);
        NodoLista nodo2 = new NodoLista(2);
        cabeza.siguiente = nodo2;
        nodo2.siguiente = cabeza; // Ciclo
        boolean resultado = tieneCiclo(cabeza);
        System.out.println("Output Ejemplo 2: " + resultado); // Output: true
    }

    public void ejemplo3() {
        NodoLista cabeza = new NodoLista(1);
        boolean resultado = tieneCiclo(cabeza);
        System.out.println("Output Ejemplo 3: " + resultado); // Output: false
    }
}