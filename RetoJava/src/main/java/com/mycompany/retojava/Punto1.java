/*
1. Escribe un programa en Java que calcule la suma de todos los números que son
múltiplos de 3 0 5 y que sean menores que un número dado N. Además, excluye aquellos
números que son múltiplos de ambos 3 y 5. Por ejemplo, si N es 10, los múltiplos de 3 0
5 menores que 10 son 3, 5, 6 y 9, y la suma sería 23.
 */
package com.mycompany.retojava;

import java.util.Scanner;

/**
 *
 * @author nicos
 */
public class Punto1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int suma = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero cualquiera. ");
        int numeroN = scanner.nextInt();

        for (int numero = 0; numero < numeroN; numero++) {
            if ((numero % 3 == 0) || (numero % 5 == 0)) {
                suma += numero;
            } else if ((numero % 3 == 0) && (numero % 5 == 0)) {
                suma += numero;
                System.out.println(numero);
            }
        }
        System.out.println(
                "Suma total de los numero multiplos de 3 0 de 5 menores que el numero culaquiera ingresado. " + suma);

    }

}
