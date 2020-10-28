package com.company;

import java.util.Stack;

public class Main {
    /* Metodos
    *push
    * pop
    * peek
    * empty
     */

    public static void main(String[] args) {
        //FILO first-in, last-out


        Stack pila = new Stack();
        pila.push(50);   //indice de 0
        pila.push("String");// indice 1
        pila.push(17);
        pila.push("Palabra");
        //Solo se puede obtener el ultimo valor
        //peek para ver, y el metodo pop para obtener
        System.out.println("El ultimo elemento en la pila es: "+pila.peek());

        while(pila.empty()==false){
            System.out.println(pila.pop());
        }

    }
}
