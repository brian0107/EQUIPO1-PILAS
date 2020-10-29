package com.company;

import java.util.Stack;

public class Main {
    /* 
    Operaciones Básicas:
    *push.- (Apilar) Agrega objetos a la pila.
    * pop.- (Retirar) Retira el ultimo elemento de la pila.
    Otras operaciones que podemos realizar:
    * peek.- Obtener el ultimo elemento de la pila.
    * empty.-True (si la pila no contiene elementos); False (si la pila contiene elementos).
    * size.- Regresa el numero de elementos contenidos en la pila.
    * search.- Realizamos la busqueda de un elemento.
     */


    public static void main(String[] args) {
        //FILO first-in, last-out


        Stack pila = new Stack();
        pila.push(50);
        pila.push("Juan");
        pila.push(17);
        pila.push("Pepe");
        System.out.println("¿La pila esta vacia? "+pila.empty()+"\n");
        System.out.println("El tamaño de la pila es : "+pila.size()+"\n");
        System.out.println("El ultimo elemento en la pila es: "+pila.peek()+"\n");
        System.out.println("Busqueda realizada: "+pila.search("Pepe")+"\n");

        while(pila.empty()==false){
            System.out.println("Eliminamos: "+pila.pop()+"\n");
        }
        System.out.println("Imprimimos la pila: "+pila);

    }
}
